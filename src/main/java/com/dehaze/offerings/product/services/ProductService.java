package com.dehaze.offerings.product.services;

import com.dehaze.offerings.product.models.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

List<Product> listAll();
Product getById(UUID id);
Product saveOrUpdate(Product product);
void delete(UUID id);

Product saveOrUpdateProductForm(ProductForm productForm);

    void deleteById(UUID productId);
}
