package com.unibuc.pao.mmo.factory;

import com.unibuc.pao.mmo.model.Phone;
import com.unibuc.pao.mmo.model.ProductCategory;

public class PhoneFactory implements ProductFactory<Phone>{

    private String attribut;

    private static PhoneFactory instance;
    public synchronized static PhoneFactory getInstance(){
        if(instance == null)
            instance = new PhoneFactory();
        //this.attribut=null;
        return instance;
    }
    @Override
    public Phone makeProduct() {
        // Creează un nou obiect Phone cu o serie de caracteristici prestabilite
        Phone phone = new Phone();
        phone.setSerialNumber("ABC123"); // Setează un număr serial
        phone.setCategory(ProductCategory.Iphone15); // Setează categoria produsului
        // Setează alte caracteristici ale telefonului, dacă este necesar
        return phone; // Returnează obiectul Phone creat
    }
}
