package com.yikai.springbootmall.dao;

import com.yikai.springbootmall.constant.ProductCategory;
import com.yikai.springbootmall.dto.ProductRequest;
import com.yikai.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
