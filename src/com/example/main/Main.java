package com.example.main;

import com.example.controller.ProductController;
import com.example.model.Category;
import com.example.model.Product;

public class Main {

    public static void main(String[] args) {
        ProductController productController = new ProductController();

        Category category1 = new Category(8);
        Product product1 = new Product("mleko", "mleko krowie", 2, category1);

        String result1 = productController.whatGrossPrice(product1);
        System.out.println(result1);

        Category category2 = new Category(2);
        Product product2 = new Product("ksiazka", "Maly Ksiaze", 25, category2);

        String result2 = productController.whatGrossPrice(product2);
        System.out.println(result2);
    }
}
