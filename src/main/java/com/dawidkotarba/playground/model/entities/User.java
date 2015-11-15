package com.dawidkotarba.playground.model.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dawid Kotarba on 15.11.2015.
 */

@Entity
@Table(name = "USER")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false, unique = true)
    private int id;

    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ROLE", nullable = false)
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
