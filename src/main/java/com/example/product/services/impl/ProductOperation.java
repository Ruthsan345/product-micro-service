package com.example.product.services.impl;

import com.example.product.api.Products;
import com.example.product.exception.UserDefinedException;
import com.example.product.model.Product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductOperation implements Products {
    public static ArrayList<Product> productList = new ArrayList<>();


    @Override
    public Product displayProductDetail(int productId){
        try{
            if (productList.isEmpty()){throw new UserDefinedException("\n Sorry !!No Products to Display\n\n");}
            for(Product n : productList){
               if(n.proId ==productId){
                   return n;
               }
            }

        }catch(UserDefinedException ud){
            System.out.println(ud.getMessage());
        }
        return null;
    }

    @Override
    public String addProduct(Product pro) {
        productList.add(pro);
        return "Successfully added the product";
    }

    @Override
    public String deleteProduct(int productId) {
        if (productList.isEmpty()){return ("\n Sorry !!No Products to delete\n\n");}
        int pos = 0;
        int trigger=-1;
        for(Product n : productList){
            if(n.proId ==productId){
                trigger=pos;
            }pos++;
        }
        if(trigger>=0){
            productList.remove(trigger);
            return("delete Successfull");
        }else return("\n Sorry !!Employee id not found enter an another id\n\n");

    }

    @Override
    public String updateProductDetail(int productId, int quantity) {
        boolean flag =false;
        for(Product pro: productList){
            if(pro.getProId() == productId){
                pro.setStock(quantity);
                flag=true;
            }
        }
        if(flag)return("Product detail updated Successfully");
        else return("no products found");
    }



}
