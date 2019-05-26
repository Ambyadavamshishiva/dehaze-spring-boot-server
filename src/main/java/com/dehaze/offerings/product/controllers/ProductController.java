package com.dehaze.offerings.product.controllers;

import com.dehaze.offerings.product.models.Product;
import com.dehaze.offerings.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> listAll() {
        return productService.listAll();
    }

    @GetMapping("/products/{productId}")
    public Product getById(@PathVariable UUID productId) {
        return productService.getById(productId);
    }

    @PostMapping("/products/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product prod = productService.saveOrUpdate(product);
        if (prod == null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/products/{productId}")
    public void deleteById(@PathVariable UUID productId) {
        productService.deleteById(productId);
    }


    @PutMapping("/products/update")
    public void deleteById(@RequestBody Product product) {
        productService.saveOrUpdate(product);
    }

}
