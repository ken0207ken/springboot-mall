package com.yikai.springbootmall.service;

import com.yikai.springbootmall.dto.ProductRequest;
import com.yikai.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
