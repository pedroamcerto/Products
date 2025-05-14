package com.products.adapter.persistance;

import com.products.application.usecases.ProductService;
import com.products.domain.Product;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(String id,Product product) {
        productRepository.save(id, product);
    }

    @Override
    public void updatePrice(String id, Double price) {
        productRepository.updatePrice(id, price);
    }
}
