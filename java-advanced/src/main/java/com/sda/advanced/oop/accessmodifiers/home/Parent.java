package com.sda.advanced.oop.accessmodifiers.home;

public class Parent {

    private String clothes;
    protected int wealth;
    String familyToilet;
    public String phoneNo;

    public void hasAccessTo() {
        System.out.println(this.clothes);
        System.out.println(this.wealth);
        System.out.println(this.familyToilet);
        System.out.println(this.phoneNo);
    }
}
