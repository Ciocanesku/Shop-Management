package com.unibuc.pao.mmo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop extends AbstractShop {
    private Map<String, List<Product>> sellerStock = new HashMap<>();
    public Shop(){
        Product phone = new Phone();
        products.add(phone);
    }

    public void addProduct(String sellerName, Product product) {
        List<Product> sellerProducts = sellerStock.get(sellerName);
        if (sellerProducts != null && !sellerProducts.isEmpty()) {
            if (sellerProducts.contains(product)) { // Verifică dacă vânzătorul deja vinde acest produs
                System.out.println("Seller " + sellerName + " already sells the product: " + product.getSerialNumber());
            } else {
                sellerProducts.add(product); // Adaugă produsul la lista vânzătorului
            }
        } else {
            sellerProducts = new ArrayList<>();
            sellerProducts.add(product);
            sellerStock.put(sellerName, sellerProducts); // Adaugă lista de produse a vânzătorului în map
        }
    }

    public List<Product> getProducts(String sellerName){
        return sellerStock.get(sellerName);
    }
    public Map<String, List<Product>> getSellerStock() {
        return sellerStock;
    }
    public List<String> getAllSellers() {
        return new ArrayList<>(sellerStock.keySet());
    }


    
    
}
