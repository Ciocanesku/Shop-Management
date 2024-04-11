package com.unibuc.pao.mmo;
import com.unibuc.pao.mmo.model.*;

import com.unibuc.pao.mmo.factory.PhoneFactory;
import com.unibuc.pao.mmo.factory.TVFactory;
import com.unibuc.pao.mmo.model.Phone;
import com.unibuc.pao.mmo.model.Product;
import com.unibuc.pao.mmo.model.TV;
import com.unibuc.pao.mmo.service.ShopService;
import com.unibuc.pao.mmo.service.ShopServiceImpl;

import java.util.List;

public class ApplicationStartup {
        public static void main(String[] args) {


            //_________________________ TEST 1 - comparare telefoane dupa serie_________________________________
                    // Crearea unui telefon
            Phone phone1 = new Phone();
            phone1.setSerialNumber("ABC123");
            phone1.setCategory(ProductCategory.Iphone15);

            // Crearea unui alt telefon
            Phone phone2 = new Phone();
            phone2.setSerialNumber("ABC123");
            phone2.setCategory(ProductCategory.Iphone15);

            // Afisarea detalilor telefonului 1
            System.out.println("Phone 1:");
            System.out.println("Serial Number: " + phone1.getSerialNumber());
            System.out.println("Category: " + phone1.getCategory());
            System.out.println("Price: " + phone1.getPrice());
            System.out.println("Quantity: " + phone1.getQuantity());

            // Afisarea detalilor telefonului 2
            System.out.println("\nPhone 2:");
            System.out.println("Serial Number: " + phone2.getSerialNumber());
            System.out.println("Category: " + phone2.getCategory());
            System.out.println("Price: " + phone2.getPrice());
            System.out.println("Quantity: " + phone2.getQuantity());

            // Verificarea egalitatii dintre cele doua telefoane
            if (phone1.equals(phone2)) {
                System.out.println("\nCele doua telefoane sunt identice.");
            } else {
                System.out.println("\nCele doua telefoane nu sunt identice.");
            }
            //____________________________________ TEST 2________________________________________

//            Shop shop = new Shop();
//            // Crearea unui serviciu pentru magazin
//            ShopService shopService = new ShopServiceImpl(shop);
//
//            // Adăugarea unor produse la magazin folosind fabrici
//            PhoneFactory phoneFactory = new PhoneFactory();
//            Phone phone = phoneFactory.makeProduct();
//            shopService.addProduct("Altex", phone);
//
//            TVFactory tvFactory = new TVFactory();
//            TV tv = tvFactory.makeProduct();
//            shopService.addProduct("Altex", tv);
//            shopService.addProduct("eMAG",tv);
//            shopService.sortProduct("Altex");
//
//            // Obținerea listei de produse pentru un anumit vânzător
//            List<Product> johnsProducts = shopService.getProducts("Altex");
//            System.out.println("Products sold by Altex:");
//            if (johnsProducts.isEmpty()) {
//                System.out.println("No products found for Altex");
//            } else {
//                for (Product product : johnsProducts) {
//                    if (product != null) {
//                        System.out.println("Product:");
//                        System.out.println("Serial Number: " + product.getSerialNumber());
//                        System.out.println("Category: " + product.getCategory());
//                        System.out.println("Price: " + product.getPrice());
//                        System.out.println("Quantity: " + product.getQuantity());
//                        System.out.println();
//                    } else {
//                        System.out.println("Found null product in the list");
//                    }
//                }
//            }
//            System.out.println("Stock value: "+ shopService.calculateTotalStockValue());
//
//            Product foundProduct = shopService.searchProduct("AAA");
//
//            // Verificarea rezultatului căutării
//            if (foundProduct != null) {
//                System.out.println("Produsul cu numărul de serie " + "AAA" + " a fost găsit:");
//            } else {
//                System.out.println("Produsul cu numărul de serie " + "AAA" + " nu a fost găsit în magazin.");
//            }
//
//
//            // Afișare lista de vânzători
//            List<String> sellers = shopService.getAllSellers();
//            System.out.println("Lista de vânzători:");
//            for (String seller : sellers) {
//                System.out.println(seller);
//            }

        }
}
