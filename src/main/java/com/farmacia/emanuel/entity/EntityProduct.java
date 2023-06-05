package com.farmacia.emanuel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "products")
public class EntityProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "code_product")
    private double codeProduct;

    @Column(name = "location")
    private String location;

    @Column(name = "amount")
    private int amount;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "iva")
    private double iva;
}
