package com.example.model;

public class Category {

    private String name;
    private int vat;

    public Category() {
    }

    public Category(int vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }


}
