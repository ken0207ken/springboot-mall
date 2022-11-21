package com.yikai.springbootmall.dao;

import com.yikai.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
