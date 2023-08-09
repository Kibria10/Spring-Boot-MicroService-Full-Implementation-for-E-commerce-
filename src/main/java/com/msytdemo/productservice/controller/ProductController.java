package com.msytdemo.productservice.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.msytdemo.productservice.dto.ProductRequest;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {

    }

    }

