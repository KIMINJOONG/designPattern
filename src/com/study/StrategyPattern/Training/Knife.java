package com.study.StrategyPattern.Training;

public class Knife implements  Weapon{


    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
