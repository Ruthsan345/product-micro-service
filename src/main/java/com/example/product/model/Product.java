package com.example.product.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "sku_id")
    public String proId;
    @Column(name = "name")
    public String proName;
    //    public int stock;
    @Column(name = "price")
    public int price;
    @Column(name = "gst_percentage")
    public int gstPercentage;

//    @OneToOne(mappedBy = "product")
//    private WarehouseInventory warehouseInventory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGstPercentage() {
        return gstPercentage;
    }

    public void setGstPercentage(int gstPercentage) {
        this.gstPercentage = gstPercentage;
    }

//    NavigableMap<Integer,Integer> discount=new TreeMap<Integer, Integer>();

//   public Product(){}
//   public Product(int id ,int proId, String name, int sto, int pri, int gst){
//       this.
//        this.proId = proId;
//        this.proName = name;
////        this.stock = sto;
//        this.price = pri;
//        this.gstPercentage = gst;
//    }
//
//
//    public int getProId() {
//        return proId;
//    }
//
//    public void setProId(int proId) {
//        this.proId = proId;
//    }
//
//    public String getProName() {
//        return proName;
//    }
//
//    public void setProName(String proName) {
//        this.proName = proName;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getGstPercentage() {
//        return gstPercentage;
//    }
//
//    public void setGstPercentage(int gstPercentage) {
//        this.gstPercentage = gstPercentage;
//    }
}
