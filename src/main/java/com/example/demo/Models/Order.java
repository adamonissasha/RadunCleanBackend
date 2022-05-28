package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "UserOrder")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String name;
    private Integer count;
    private Long price;
    private String userFIO;
    private String userPhone;
    private String userEmail;
    private String address;
    private String date;
    private String time;
    private String comment;
    private String orderCreationDate;
}