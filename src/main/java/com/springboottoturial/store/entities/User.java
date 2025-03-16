package com.springboottoturial.store.entities;


public class User {
    
    public Long id;
    public String name;
    public String email;
    public String password;

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public Long setId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail() {
        return this.email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword() {
        return this.password;
    }
}
