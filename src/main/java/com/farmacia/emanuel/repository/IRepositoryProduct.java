package com.farmacia.emanuel.repository;

import com.farmacia.emanuel.dto.response.ResponseCreateProduct;
import com.farmacia.emanuel.entity.EntityProduct;
import com.farmacia.emanuel.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRepositoryProduct extends JpaRepository<EntityProduct, Long> {


    ResponseCreateProduct saveProduct(Product product);
}
