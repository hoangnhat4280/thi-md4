package com.example.baithi_md4.repository;

import com.example.baithi_md4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProductRepository extends JpaRepository<Product, Long> {
}