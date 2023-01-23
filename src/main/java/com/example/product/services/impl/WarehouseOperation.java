package com.example.product.services.impl;

import com.example.product.api.Warehouses;
import com.example.product.model.Product;
import com.example.product.model.Warehouse;
import com.example.product.model.WarehouseInventory;
import com.example.product.repository.ProductRepository;
import com.example.product.repository.WarehouseInventoryRepository;
import com.example.product.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class WarehouseOperation implements Warehouses {

    @Autowired
    WarehouseRepository warehouseRepository;
    @Autowired
    WarehouseInventoryRepository warehouseInventoryRepository;

    @Override
    public ArrayList<Warehouse> displayAllWarehouse() {

            return (ArrayList<Warehouse>) warehouseRepository.findAll();
    }

    @Override
    public Optional<Warehouse> displayWarehouseDetail(int warehouseId) {
        return warehouseRepository.findById(warehouseId);
    }

    @Override
    public String addWarehouse(Warehouse warehouse) {
         warehouseRepository.save(warehouse);
        return "added warehouse Successfully";
    }

    @Override
    public String addProductToWarehouse(WarehouseInventory warehouseInventory) {
//        warehouseRepository.save(warehouseInventory);
        warehouseInventoryRepository.save(warehouseInventory);
        return "Inventory added";
    }

    @Override
    public ResponseEntity<String> updateProductToWareHouse(int inventoryId, int quantity ) {
        WarehouseInventory warehouseInventory = warehouseInventoryRepository.findById(inventoryId);
        warehouseInventory.setStock(quantity);
        warehouseInventoryRepository.save(warehouseInventory);

        return new ResponseEntity( "successfully updated", HttpStatus.OK);

    }

    @Override
    public ArrayList<WarehouseInventory> getAllProductsByWarehouseId(int warehouseId) {

        return warehouseInventoryRepository.findByWarehouseid(warehouseId);
    }

    @Override
    public String deleteProductUsingInventoryId(int inventoryId) {
        warehouseInventoryRepository.deleteById(inventoryId);

        return "Deleted product from warehouse";
    }
}
