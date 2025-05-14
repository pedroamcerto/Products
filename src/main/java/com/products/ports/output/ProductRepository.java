package com.products.ports.output;

import com.products.domain.Product;

public interface ProductRepository {
    void save(Product product);
    Product findById(String id);
}
