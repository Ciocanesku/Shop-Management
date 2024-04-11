package com.unibuc.pao.mmo.model;

public interface Product {

    /**
     * @return Product price. Eg: 175.75, 200
     */
    double getPrice();

    /**
     * @return Product category. Eg: Phone, Laptop
     */
    ProductCategory getCategory();

    /**
     * @return Product quantity. Eg: 10, 20
     */
    int getQuantity();

    String getSerialNumber();
}
