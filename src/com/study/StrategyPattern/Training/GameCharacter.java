package com.study.StrategyPattern.Training;

public class GameCharacter {
    // 접근점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {

        if(weapon == null) {
            System.out.println("맨손 공격");
        } else {
            // 델리게이트
            // 나는 칼을들었으니까 칼공격, 검을 들었으니까 검공격하는것이 아니라
            // 내가 어떤것을 들고있느냐에 따라 공격형태가 변형된다.
            // 나는 어떻게 공격되는지 모르고 weapon이 다알아서 할거다.

            weapon.attack();
        }


    }
}
