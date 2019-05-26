package com.dehaze.offerings.product.converters;

import com.dehaze.offerings.product.models.Product;
import com.dehaze.offerings.product.services.ProductForm;
import org.springframework.core.convert.converter.Converter;
        import org.springframework.stereotype.Component;

@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
