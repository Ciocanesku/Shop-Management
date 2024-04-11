package com.unibuc.pao.mmo.factory;

import com.unibuc.pao.mmo.model.Product;

public interface ProductFactory <T extends Product>{
    T makeProduct();
}
