package com.study.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.setBluePrint(new LGGramBluePrint());
        computerFactory.make();

        Computer computer = computerFactory.getComputer();

        System.out.println(computer.toString());
    }
}
