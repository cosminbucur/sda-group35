package com.sda.advanced.oop.accessmodifiers.away;

import com.sda.advanced.oop.accessmodifiers.home.Parent;

public class Sister extends Parent {

    public void hasAccessTo() {
        System.out.println(super.wealth);
        System.out.println(super.phoneNo);
    }
}
