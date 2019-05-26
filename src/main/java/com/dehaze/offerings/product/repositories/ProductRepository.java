package com.dehaze.offerings.product.repositories;

import com.dehaze.offerings.product.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {

}
