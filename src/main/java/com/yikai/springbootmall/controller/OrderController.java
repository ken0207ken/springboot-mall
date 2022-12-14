package com.yikai.springbootmall.controller;

import com.yikai.springbootmall.dto.CreateOrderRequest;
import com.yikai.springbootmall.model.OrderItem;
import com.yikai.springbootmall.model.OrderSummary;
import com.yikai.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("users/{userId}/orders")
    public ResponseEntity<OrderSummary> createOrder(@PathVariable Integer userId,
                                         @RequestBody @Valid CreateOrderRequest createOrderRequest){

        Integer orderId = orderService.createOrder(userId, createOrderRequest);

        OrderSummary orderSummary = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.CREATED).body(orderSummary);

    }
}
