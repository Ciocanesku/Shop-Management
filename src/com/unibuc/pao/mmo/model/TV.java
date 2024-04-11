package com.unibuc.pao.mmo.model;

public class TV extends AbstractProduct {
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
        return 20000; // Prețul televizorului
    }

    @Override
    public int getQuantity() {
        return 5; // Cantitatea disponibilă de televizoare
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product otherProduct = (Product) obj;
            if (this instanceof TV && obj instanceof TV) {
                TV thisTV = (TV) this;
                TV otherTV = (TV) otherProduct;
                // Verificăm dacă proprietatea specifică pentru televizoare este egală
                if (thisTV.getSerialNumber().equals(otherTV.getSerialNumber())) {
                    return true;
                }
            }
        }
        return false;
    }
}
