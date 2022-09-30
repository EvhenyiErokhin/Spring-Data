package com.example.Spring.Data.repository;

import com.example.Spring.Data.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
