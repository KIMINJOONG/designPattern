package com.study.BuilderPatternPartTwo;

public class Main {
    public static void main(String[] args) {
        Computer computer =
                ComputerBuilder
                        .startWithCpu("i7")
//                        .start()
//                        .setCpu("i7")
                        .setRam("8g")
                        .build();

        System.out.println(computer.toString());
    }
}
