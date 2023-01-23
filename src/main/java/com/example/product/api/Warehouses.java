package com.example.product.api;

import com.example.product.model.Product;
import com.example.product.model.Warehouse;
import com.example.product.model.WarehouseInventory;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Optional;

public interface Warehouses {
    ArrayList<Warehouse> displayAllWarehouse();
    Optional<Warehouse>displayWarehouseDetail(int warehouseId);
    String addWarehouse(Warehouse warehouse);
    String addProductToWarehouse(WarehouseInventory warehouseInventory);
    ResponseEntity<String> updateProductToWareHouse(int inventoryId, int quantity);

    ArrayList<WarehouseInventory> getAllProductsByWarehouseId(int warehouseId);

    String  deleteProductUsingInventoryId(int inventoryId);
}
