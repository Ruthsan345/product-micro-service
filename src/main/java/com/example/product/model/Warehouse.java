package com.example.product.model;


import javax.persistence.*;

@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "reference_id")
    public String reference_id;
    @Column(name = "name")
    public String warehouse_name;
    @Column(name = "contact_mail")
    public String contact_mail;
    @Column(name = "contact_mobile_no")
    public String contact_mobile_no;

//    @OneToOne(mappedBy = "warehouse")
//    private WarehouseInventory warehouseInventory;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference_id() {
        return reference_id;
    }

    public void setReference_id(String reference_id) {
        this.reference_id = reference_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getContact_mail() {
        return contact_mail;
    }

    public void setContact_mail(String contact_mail) {
        this.contact_mail = contact_mail;
    }

    public String getContact_mobile_no() {
        return contact_mobile_no;
    }

    public void setContact_mobile_no(String contact_mobile_no) {
        this.contact_mobile_no = contact_mobile_no;
    }


}
