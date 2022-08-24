package com.example.myspringproject.controller;

import com.example.myspringproject.dataformat.JsonFormat;
import com.example.myspringproject.entities.ProductEntity;
import com.example.myspringproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public JsonFormat<ProductEntity> createProduct(@RequestBody ProductEntity products) {
        System.out.println(products);
        ProductEntity product = new ProductEntity("컴퓨터", 1000000, "가전 제품");

        return new JsonFormat<>(200, "success to get product!", product);
    }
}
