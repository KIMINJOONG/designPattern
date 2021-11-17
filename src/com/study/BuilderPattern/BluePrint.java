package com.study.BuilderPattern;

public abstract class BluePrint {
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();

    public abstract Computer getComputer();
}
