package com.example.controller;

import com.example.model.Category;
import com.example.model.Product;

public class ProductController {

    public String whatGrossPrice(Product product) {
        Category category = new Category();
        int vat = product.getCategory().getVat();
        String result = null;

        switch (vat) {
            case 2:
                result = "nauka";
                category.setName(result);
                break;
            case 8:
                result = "zywnosc";
                category.setName(result);
                break;
            case 23:
                result = "uzywki";
                category.setName(result);
                break;
            default:
                result = "pozostale";
                category.setName(result);
                break;
        }
        return product.showInfo() + result + ", VAT: " + vat;

    }
}
