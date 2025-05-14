package com.products.ports.input;

import com.products.application.repositories.ProductRepositoryImpl;
import com.products.application.usecases.ProductService;
import com.products.domain.Product;
import com.products.ports.output.ProductRepository;

public class ProductServiceImpl implements ProductService {

    private final ProductRepositoryImpl productRepository;

    public ProductServiceImpl(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(String id,Product product) {
        productRepository.save(product);
    }

    @Override
    public void updatePrice(String id, Double price) {
        Product product = productRepository.findById(id);
        product.setPrice(price);

        productRepository.save(product);
    }
}
