package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Users12", schema = "public")

@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;
    private String password;
   
    private String status;
    

    // Default constructor setting the status to 'pending'
    public Users() {
        this.status = "pending";  // Default value
    }
}
   
