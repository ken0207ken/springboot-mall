package com.yikai.springbootmall.service;

import com.yikai.springbootmall.dto.ProductQueryParams;
import com.yikai.springbootmall.dto.ProductRequest;
import com.yikai.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
