package com.example.POS_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> allProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found!"));
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product updatedProduct){
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found!"));
        product.setProductName(updatedProduct.getProductName());
        product.setProductPrice(updatedProduct.getProductPrice());
        product.setProductStock(updatedProduct.getProductStock());
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id){
        productRepository.deleteById(id);
    }

}
