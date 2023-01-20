package com.example.product.repository;

import com.example.product.model.Product;
import com.example.product.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    Optional<Warehouse> findById(int Id);

}
