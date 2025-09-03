package com.example.lista4.model;

public class Product {
    private long id;
    private String name;
    private String status; // "PENDING" or "PURCHASED"
    private String date;

    public Product() {}

    public Product(String name, String status, String date) {
        this.name = name;
        this.status = status;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
