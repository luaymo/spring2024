package com.coffeeshop.controller;

import com.coffeeshop.domain.Product;
import com.coffeeshop.service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    // Other product related endpoints
}
