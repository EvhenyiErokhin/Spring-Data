package com.example.Spring.Data.controller;

import com.example.Spring.Data.entity.Product;
import com.example.Spring.Data.service.ProductService;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

}
