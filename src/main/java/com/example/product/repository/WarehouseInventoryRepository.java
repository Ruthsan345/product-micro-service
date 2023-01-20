package com.example.product.repository;

import com.example.product.model.Product;
import com.example.product.model.Warehouse;
import com.example.product.model.WarehouseInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface WarehouseInventoryRepository extends JpaRepository<WarehouseInventory, Integer>{
    WarehouseInventory findById(int Id);
    ArrayList<WarehouseInventory> findByWarehouseid(int Id);

}

