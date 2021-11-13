package com.study.PrototypePatternPartTwo;

public class Cat implements Cloneable {
    public String name;
    public Age age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat)this.clone();

        // 이렇게 하면 명시적으로 깊은 복사가 됌(좋은 방법은 아님)
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
        return ret;
    }
}
