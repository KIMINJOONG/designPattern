package com.study.StrategyPattern.Training;

public class Sword implements Weapon{

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
