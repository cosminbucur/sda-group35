package com.sda.advanced.oop.accessmodifiers.home;

public class Thief {

    public void hasAccessTo() {
        Parent parent = new Parent();
        System.out.println(parent.wealth);
        System.out.println(parent.familyToilet);
        System.out.println(parent.phoneNo);
    }
}
