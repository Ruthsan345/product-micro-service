package com.example.product.controller;

import com.example.product.api.Products;
import com.example.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.Optional;


@RequestMapping("product/api/")
@RestController()
public class ProductController {
    @Autowired
    Products productOp;

//    @Cacheable(value="Product")
    @GetMapping("/getAllProduct")
    public ArrayList<Product> displayAllProduct() {
        return productOp.displayAllProduct();
    }

//    @Cacheable(value="Product", key="#productId")
    @GetMapping("/getProductById/{productId}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable int productId) {
        Optional<Product> pro= productOp.displayProductDetail(productId);
        return new ResponseEntity<>(pro, HttpStatus.OK) ;
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        return productOp.addProduct(product);
    }

//    @CacheEvict(value="Product", key="#productId")
    @DeleteMapping("/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        return productOp.deleteProduct(productId);
    }

//    @PutMapping("/updateProduct")
//    public String updateProduct(@RequestParam int productId, @RequestParam int quantity) {
//        return productOp.updateProductDetail(productId, quantity);
//    }

}
