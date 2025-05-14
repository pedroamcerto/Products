package com.products.application.usecases;

import com.products.domain.Product;

public interface ProductService {
    void createProduct(String id, Product product);
    void updatePrice(String id, Double price);
}
