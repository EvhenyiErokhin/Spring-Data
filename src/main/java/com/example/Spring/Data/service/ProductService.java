package com.example.Spring.Data.service;

import com.example.Spring.Data.entity.Product;

public interface ProductService {
    Iterable<Product> findAll();

    Product save(Product product);
}
