package com.farmacia.emanuel.model;

import java.util.Date;

public class Product {
    private Long idProduct;
    private String name;
    private String description;
    private double price;
    private double codeProduct;
    private String location;
    private int amount;
    private Date expirationDate;
    private double iva;

    public Product() {
    }

    public Product(Long idProduct, String name, String description, double price, double codeProduct, String location, int amount, Date expirationDate, double iva) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.codeProduct = codeProduct;
        this.location = location;
        this.amount = amount;
        this.expirationDate = expirationDate;
        this.iva = iva;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(double codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
