package com.example.product.controller;

import com.example.product.api.Products;
import com.example.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.Optional;


@RequestMapping("product/api/")
@RestController()
public class ProductController {
    @Autowired
    Products productOp;


//    @EventListener(ApplicationReadyEvent.class)
//    public void runAfterStartup() throws IOException {
//        csvRead.readProductCsv(ProductOperation.productList);
//        System.out.print("<--------------Product read from CSV-------------->");
//    }

    @GetMapping("/getAllProduct")
    public ArrayList<Product> displayAllProduct() {
        return productOp.displayAllProduct();
    }

    @GetMapping("/getProductById")
    public Optional<Product> getProduct(@RequestParam int productId) {
        Optional<Product> pro = productOp.displayProductDetail(productId);
        return pro ;
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        return productOp.addProduct(product);
    }

    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam int productId) {
        return productOp.deleteProduct(productId);
    }

//    @PutMapping("/updateProduct")
//    public String updateProduct(@RequestParam int productId, @RequestParam int quantity) {
//        return productOp.updateProductDetail(productId, quantity);
//    }

}
