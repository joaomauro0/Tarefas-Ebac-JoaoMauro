package com.joaomauro0.productservice.repository;

import com.joaomauro0.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
