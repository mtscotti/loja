package com.treinamento.alfa.repositories;

import com.treinamento.alfa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
