package com.yikai.springbootmall.dao;

import com.yikai.springbootmall.model.OrderItem;
import com.yikai.springbootmall.model.OrderSummary;

import java.util.List;

public interface OrderDao {

    OrderSummary getOrderSummaryByOrderId(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

}
