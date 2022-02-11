package com.sda.advanced.oop.accessmodifiers.home;

public class Brother extends Parent {

    public void hasAccessTo() {
        System.out.println(super.wealth);
        System.out.println(super.familyToilet);
        System.out.println(super.phoneNo);
    }
}
