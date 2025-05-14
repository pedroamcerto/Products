package com.products.domain;

public class Product {
    private String id;
    private String name;
    private String code;
    private Double price;

    public Product(String id, String name, String code, Double price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
