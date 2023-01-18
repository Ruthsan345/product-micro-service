package com.example.product.controller;

import com.example.product.api.Products;
import com.example.product.helper.CsvReader;
import com.example.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import com.example.product.services.impl.ProductOperation;

import java.io.IOException;


@RequestMapping("product/api/")
@RestController()
public class ProductController {
    @Autowired
    Products productOp;
    @Autowired
    CsvReader csvRead;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() throws IOException {
        csvRead.readProductCsv(ProductOperation.productList);
        System.out.print("<--------------Product read from CSV-------------->");
    }

    @GetMapping("/getProduct")
    public Product getProduct(@RequestParam int productId) {
        return productOp.displayProductDetail(productId);
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        return productOp.addProduct(product);
    }

    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam int productId) {
        return productOp.deleteProduct(productId);
    }

    @PutMapping("/updateProduct")
    public String updateProduct(@RequestParam int productId, @RequestParam int quantity) {
        return productOp.updateProductDetail(productId, quantity);
    }
}
