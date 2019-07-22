package com.example.controller;

import com.example.model.Product;

public class ProductController {

    public double whatGrossPrice(Product product) {
        int vat = product.getCategory().getVat();
        double gross;

        switch (vat) {
            case 2:
                gross = 1.02 * product.getNetPrice();
                break;
            case 8:
                gross = 1.08 * product.getNetPrice();
                break;
            case 23:
                gross = 1.23 * product.getNetPrice();
                break;
            default:
                gross = product.getNetPrice();
                break;
        }
        return gross;

    }
}
