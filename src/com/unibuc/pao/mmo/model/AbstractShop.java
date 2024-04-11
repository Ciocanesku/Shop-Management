package com.unibuc.pao.mmo.model;

import java.util.ArrayList;
import java.util.List;

public class AbstractShop {
    protected List<Product> products = new ArrayList<>();


    public void addProduct(Product car){
        products.add(car);

    }

    public List<Product> getProducts() {
        return products;
    }
}
