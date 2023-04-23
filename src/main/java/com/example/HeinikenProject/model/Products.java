package com.example.HeinikenProject.model;

public enum Products {
    HEINIKEN(6.00, 4),
    KAISER(4.0,6),
    AMSTEL(3.0, 12);

    double price;
    int productQuantityperCrate;
    Products (double price, int productQuantityperCrate){
        this.price = price;
        this.productQuantityperCrate = productQuantityperCrate;

    }
}
