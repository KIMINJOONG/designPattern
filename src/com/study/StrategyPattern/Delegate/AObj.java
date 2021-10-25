package com.study.StrategyPattern.Delegate;

import com.study.StrategyPattern.Interface.Ainerface;
import com.study.StrategyPattern.Interface.AinterfaceImpl;

public class AObj {

    Ainerface ainerface;

    public AObj() {
        ainerface = new AinterfaceImpl();
    }

    public void funcAA() {
        ainerface.funcA();
        ainerface.funcA();

//        System.out.println("AAA");
//        System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요
    }
}
