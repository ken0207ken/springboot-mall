package com.yikai.springbootmall.service.impl;

import com.yikai.springbootmall.dao.ProductDao;
import com.yikai.springbootmall.model.Product;
import com.yikai.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
