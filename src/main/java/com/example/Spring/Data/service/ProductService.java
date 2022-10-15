package com.example.Spring.Data.service;

import com.example.Spring.Data.entity.Product;
import com.example.Spring.Data.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ProductService {
    @PostConstruct
    void init() {
        Product product = new Product("Oil", "black");
        Product product1 = new Product("Sugar", "green");
        productRepository.saveAll(List.of(product, product1));
    }

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
}
