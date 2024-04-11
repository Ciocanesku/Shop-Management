package com.unibuc.pao.mmo.factory;


import com.unibuc.pao.mmo.model.Phone;
import com.unibuc.pao.mmo.model.ProductCategory;
import com.unibuc.pao.mmo.model.TV;

public class TVFactory implements ProductFactory<TV>{

    private String attribut;

    private static TVFactory instance;

    public synchronized static TVFactory getInstance(){
        if(instance == null)
            instance = new TVFactory();
        //this.attribut=null;
        return instance;
    }

    @Override
    public TV makeProduct() {
        // Creează un nou obiect Phone cu o serie de caracteristici prestabilite
        TV tv = new TV();
        tv.setSerialNumber("AAA"); // Setează un număr serial
        tv.setCategory(ProductCategory.TVSamsung); // Setează categoria produsului
        // Setează alte caracteristici ale telefonului, dacă este necesar
        return tv; // Returnează obiectul Phone creat
    }
}
