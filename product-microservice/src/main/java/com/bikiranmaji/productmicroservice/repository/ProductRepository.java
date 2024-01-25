package com.bikiranmaji.productmicroservice.repository;

import com.bikiranmaji.productmicroservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
