package com.example.product.controller;

import com.example.product.api.Warehouses;
import com.example.product.model.Product;
import com.example.product.model.Warehouse;
import com.example.product.model.WarehouseInventory;
import com.example.product.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RequestMapping("warehouse/api/")
@RestController()
public class WarehouseController {
    @Autowired
    Warehouses warehousesOp;

    @GetMapping("/getAllWarehouse")
    public ArrayList<Warehouse> displayAllWarehouse() {
        return warehousesOp.displayAllWarehouse();
    }

    @GetMapping("/getWarehouseById/{warehouseId}")
    public Optional<Warehouse> getWarehouse(@PathVariable int warehouseId) {
        Optional<Warehouse> pro = warehousesOp.displayWarehouseDetail(warehouseId);
        return pro ;
    }

    @PostMapping("/addWarehouse")
    public String addWarehouse(@RequestBody Warehouse warehouse) {
        return warehousesOp.addWarehouse(warehouse);
    }

    @PostMapping("/addProductToWarehouse")
    public String addProductToWarehouse(@RequestBody WarehouseInventory warehouseInventory) {
        return warehousesOp.addProductToWarehouse(warehouseInventory);
    }

    @PutMapping("/updateProductToWareHouse")
    public ResponseEntity<String> updateProductToWareHouse(@RequestParam int inventoryId, @RequestParam int quantity ) {
        return warehousesOp.updateProductToWareHouse(inventoryId,quantity);
    }

    @GetMapping("/getAllProductsByWarehouseId/{warehouseId}")
    public ArrayList<WarehouseInventory> getAllProductsByWarehouseId(@PathVariable int warehouseId) {
        ArrayList<WarehouseInventory> pro = warehousesOp.getAllProductsByWarehouseId(warehouseId);
        return pro ;
    }

    @DeleteMapping("/deleteProductUsingInventoryId/{inventoryId}")
    public String deleteProductUsingInventoryId(@PathVariable int inventoryId) {

        return warehousesOp.deleteProductUsingInventoryId(inventoryId);
    }



}
