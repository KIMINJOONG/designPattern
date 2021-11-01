package com.study.FactoryMethodPattern.concrete;

import com.study.FactoryMethodPattern.framework.Item;
import com.study.FactoryMethodPattern.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터 베이스에서 체력 회복물약에 대한 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복물약을 새로 생성했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        // 작업
        return new HpPotion();
    }
}
