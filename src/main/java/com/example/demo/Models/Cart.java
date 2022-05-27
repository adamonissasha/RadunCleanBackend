package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "cart")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String name;
    private Integer count;
    private Integer count1;
    private Integer count2;
    private Long price;
    private String unit;
}
