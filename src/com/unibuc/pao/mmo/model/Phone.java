package com.unibuc.pao.mmo.model;

public class Phone extends AbstractProduct{
    private String serialNumber;
    private ProductCategory category;

    @Override
    public ProductCategory getCategory() {
        return category;
    }

    @Override
    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    @Override
    public double getPrice() {
        return 15000;
    }

    @Override
    public int getQuantity() {
        return 10;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product otherProduct = (Product) obj;
            if (this instanceof Phone && obj instanceof Phone) {
                Phone thisPhone = (Phone) this;
                Phone otherPhone = (Phone) otherProduct;
                // Verificăm dacă proprietatea specifică pentru telefoane este egală
                if (thisPhone.getSerialNumber().equals(otherPhone.getSerialNumber())) {
                    return true;
                }
            }
        }
        return false;
    }
}
