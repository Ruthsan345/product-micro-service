package com.example.product.api;

import com.example.product.model.Product;

import java.util.ArrayList;

public interface Products {
     Product displayProductDetail(int productId);
     String addProduct(Product pro);
     String deleteProduct(int productId);
     String updateProductDetail(int productId, int quantity);

}
