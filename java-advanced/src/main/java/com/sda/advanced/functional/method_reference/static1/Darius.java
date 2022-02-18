package com.sda.advanced.functional.method_reference.static1;

public class Darius {

    static int hp = 100;

    public static int dealDamage(int attackDamage, int trueDamage) {
        return attackDamage + trueDamage;
    }

    public static int healUp(int hp) {
        return Darius.hp += hp;
    }
}
