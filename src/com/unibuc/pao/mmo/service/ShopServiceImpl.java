package com.unibuc.pao.mmo.service;

import com.unibuc.pao.mmo.model.Product;
import com.unibuc.pao.mmo.model.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ShopServiceImpl implements ShopService {
    private Shop shop;

    public ShopServiceImpl(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void addProduct(String sellerName, Product product) {
        shop.addProduct(sellerName, product);
    }

    @Override
    public List<Product> getProducts(String sellerName) {
        return shop.getProducts(sellerName);
    }


    public void sortProduct(String sellerName){
        // Obținem lista de produse a vânzătorului specificat
        List<Product> sellerProducts = getProducts(sellerName);

        // Comparator pentru sortarea produselor după numărul de serie
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                // Comparăm numerele de serie
                return p1.getSerialNumber().compareTo(p2.getSerialNumber());
            }
        };

        // Sortăm lista de produse folosind comparatorul definit
        Collections.sort(sellerProducts, productComparator);

        // Afisăm lista sortată (opțional)
        for (Product product : sellerProducts) {
            System.out.println(product.getSerialNumber() + " - " + product.getCategory());
        }
    }
    @Override
    public double calculateTotalStockValue() {
        double totalValue = 0.0;
        for (List<Product> products : shop.getSellerStock().values()) {
            for (Product product : products) {
                totalValue += product.getPrice() * product.getQuantity();
            }
        }
        return totalValue;
    }

    public Product searchProduct(String serialNumber) {
        for (Map.Entry<String, List<Product>> entry : shop.getSellerStock().entrySet()) {
            List<Product> products = entry.getValue();
            for (Product product : products) {
                if (product.getSerialNumber().equals(serialNumber)) {
                    return product;
                }
            }
        }
        return null; // Returnează null dacă nu este găsit niciun produs cu numărul de serie dat
    }
    @Override
    public List<String> getAllSellers() {
        return shop.getAllSellers();
    }

}
