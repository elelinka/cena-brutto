package com.example.controller;

import com.example.model.Product;

public class ProductController {

    public double whatGrossPrice(Product product) {
        String categoryName = product.getCategory().getName();
        double gross;

        switch (categoryName) {
            case "nauka":
                gross = 1.02 * product.getNetPrice();
                break;
            case "zywnosc":
                gross = 1.08 * product.getNetPrice();
                break;
            case "uzywki":
                gross = 1.23 * product.getNetPrice();
                break;
            default:
                gross = product.getNetPrice();
                break;
        }
        return gross;

    }
}
