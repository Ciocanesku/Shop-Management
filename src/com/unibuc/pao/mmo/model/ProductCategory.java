package com.unibuc.pao.mmo.model;

public enum ProductCategory {
    Iphone15("Phone","Iphone 15"),
    TVSamsung("TV", "Samsung QLED");

    private String category;
    private String model;
    private ProductCategory(String category, String model){
        this.category=category;
        this.model=model;
    }
}
