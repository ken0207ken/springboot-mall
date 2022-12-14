package com.yikai.springbootmall.service.impl;

import com.yikai.springbootmall.dao.OrderDao;
import com.yikai.springbootmall.dao.ProductDao;
import com.yikai.springbootmall.dto.BuyItem;
import com.yikai.springbootmall.dto.CreateOrderRequest;
import com.yikai.springbootmall.model.OrderItem;
import com.yikai.springbootmall.model.OrderSummary;
import com.yikai.springbootmall.model.Product;
import com.yikai.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for(BuyItem buyItem : createOrderRequest.getBuyItemList()) {
            Product product = productDao.getProductById(buyItem.getProductId());

            //計算總價錢
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount = totalAmount + amount;

            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }


        //創建訂單
        Integer orderId = orderDao.createOrder(userId, totalAmount);

        orderDao.createOrderItems(orderId, orderItemList);

        return orderId;
    }

    @Override
    public OrderSummary getOrderById(Integer orderId) {
        OrderSummary orderSummary = orderDao.getOrderSummaryByOrderId(orderId);

        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);

        orderSummary.setOrderItemList(orderItemList);

        return orderSummary;
    }
}
