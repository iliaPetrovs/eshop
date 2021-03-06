package com.ecommerce.fujifox.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @GeneratedValue
    @Id
    private int id;

    private String name;
    private String description;
    private String image;

    private double price;
    private int stock;
}
