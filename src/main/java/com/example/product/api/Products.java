package com.example.product.api;

import com.example.product.model.Product;

import java.util.ArrayList;
import java.util.Optional;

public interface Products {
     Optional<Product> displayProductDetail(int productId);
     String addProduct(Product pro);
     String deleteProduct(int productId);
     ArrayList<Product> displayAllProduct();
//     String updateProductDetail(int productId, int quantity);

}
