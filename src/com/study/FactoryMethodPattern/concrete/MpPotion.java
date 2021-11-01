package com.study.FactoryMethodPattern.concrete;

import com.study.FactoryMethodPattern.framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
