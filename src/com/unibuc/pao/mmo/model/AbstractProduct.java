package com.unibuc.pao.mmo.model;

public abstract class AbstractProduct implements Product {
    private ProductCategory category;


    @Override
    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
