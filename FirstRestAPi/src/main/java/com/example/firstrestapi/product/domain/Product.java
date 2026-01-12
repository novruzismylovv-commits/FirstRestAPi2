package com.example.firstrestapi.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name ="products")
public class Product{

    @Id
    @GeneratedValue
    private Long Id;
    private String Name;


    public Product(){

    }

    public Product(String Name) {this.Name = Name;}

    public Long getId() {return Id;}

    public String getName() {return Name;}
    public void setId(Long id) {this.Id = id;}
    public void setName(String name) {this.Name = name;}
}