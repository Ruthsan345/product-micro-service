package com.example.product.services.impl;

import com.example.product.api.Products;
import com.example.product.exception.UserDefinedException;
import com.example.product.model.Product;

//import com.example.product.repository.ProductRepository;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductOperation implements Products {
    public static ArrayList<Product> productList = new ArrayList<>();

    @Autowired
    ProductRepository productRepository;


    @Override
    public ArrayList<Product> displayAllProduct() {
        return (ArrayList<Product>) productRepository.findAll();
    }




    @Override
    public Optional<Product> displayProductDetail(int productId){
        return productRepository.findById(productId);
    }

    @Override
    public String addProduct(Product pro) {
        productRepository.save(pro);
//        productList.add(pro);
        return "Successfully added the product";
    }

    @Override
    public String deleteProduct(int productId) {
        productRepository.deleteById(productId);

        return "Deleted successfully!!ß";
    }


//    @Override
//    public String updateProductDetail(int productId, int quantity) {
//        boolean flag =false;
//        for(Product pro: productList){
//            if(pro.getProId() == productId){
//                pro.(quantity);
//                flag=true;
//            }
//        }
//        if(flag)return("Product detail updated Successfully");
//        else return("no products found");
//    }



}
