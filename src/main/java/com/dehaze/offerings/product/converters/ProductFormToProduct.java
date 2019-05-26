package com.dehaze.offerings.product.converters;

import com.dehaze.offerings.product.models.Product;
import com.dehaze.offerings.product.services.ProductForm;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.core.convert.converter.Converter;

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(productForm.getId());
        }
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}
