package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vacancies")
@Data
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String schedule;
    private String salary;
}
