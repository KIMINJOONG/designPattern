package com.study.FactoryMethodPattern.concrete;

import com.study.FactoryMethodPattern.framework.Item;
import com.study.FactoryMethodPattern.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator itemCreator;
        Item item;
        itemCreator = new HpCreator();
        item = itemCreator.create();
        item.use();

        itemCreator = new MpCreator();
        item = itemCreator.create();
        item.use();
    }
}
