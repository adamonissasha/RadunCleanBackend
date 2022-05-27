package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "services")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private String imgUrl;
    private String unit;
}
