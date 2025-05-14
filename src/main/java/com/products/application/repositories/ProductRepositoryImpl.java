package com.products.application.repositories;

import com.products.domain.Product;
import com.products.ports.output.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    private final Map<String, Product> storage = new HashMap<>();

    public void save(Product product){
        storage.put(product.getId(),product);
    }

    public Product findById(String id){
        return storage.get(id);
    }   
}
