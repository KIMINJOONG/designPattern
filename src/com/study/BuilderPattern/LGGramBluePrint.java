package com.study.BuilderPattern;

public class LGGramBluePrint extends BluePrint{
    private String cpu;
    private String ram;
    private String storage;


    @Override
    public void setCpu() {
        cpu = "i9";
    }

    @Override
    public void setRam() {
        ram = "16g";
    }

    @Override
    public void setStorage() {
        storage = "512g ssd";
    }

    @Override
    public Computer getComputer() {
        return new Computer(cpu, ram, storage);
    }
}
