package com.example.main;

import com.example.controller.ProductController;
import com.example.model.Category;
import com.example.model.Product;

public class Main {

    public static void main(String[] args) {
        ProductController productController = new ProductController();

        Category category1 = new Category("zywnosc");
        Product product1 = new Product("mleko", "mleko krowie", 2, category1);

        double result1 = productController.whatGrossPrice(product1);
        System.out.println(product1.showInfo() + result1);

        Category category2 = new Category("nauka");
        Product product2 = new Product("ksiazka", "Maly Ksiaze", 25, category2);

        double result2 = productController.whatGrossPrice(product2);
        System.out.println(product2.showInfo() + result2);
    }
}
