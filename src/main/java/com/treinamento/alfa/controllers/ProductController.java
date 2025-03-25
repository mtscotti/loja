package com.treinamento.alfa.controllers;

import com.treinamento.alfa.dto.ProductDTO;
import com.treinamento.alfa.entities.Product;
import com.treinamento.alfa.repositories.ProductRepository;
import com.treinamento.alfa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
       ProductDTO dto = service.findById(id);
       return dto;
    }

}
