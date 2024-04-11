package com.unibuc.pao.mmo.service;

import com.unibuc.pao.mmo.model.Product;
import java.util.List;

public interface ShopService {
    void addProduct(String sellerName, Product product);
    List<Product> getProducts(String sellerName);

    void sortProduct(String sellerName);
    double calculateTotalStockValue();

    Product searchProduct(String serialNumber);

    List<String> getAllSellers();
}