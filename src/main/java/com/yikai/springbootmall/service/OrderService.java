package com.yikai.springbootmall.service;

import com.yikai.springbootmall.dto.CreateOrderRequest;
import com.yikai.springbootmall.model.OrderSummary;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    OrderSummary getOrderById(Integer orderId);
}
