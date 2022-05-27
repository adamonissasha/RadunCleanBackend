package com.example.demo.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FIO;
    private String phone;
    private String email;
    private String password;
    private boolean active;

//    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//    @CollectionTable(name="user_role", joinColumns = @JoinColumn(name = "user_id"))

    private String roles;
    public User(String FIO, String phone, String email, String password) {
        this.FIO = FIO;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

}
