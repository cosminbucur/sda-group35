package com.sda.advanced.oop.accessmodifiers;

import com.sda.advanced.oop.accessmodifiers.home.Parent;

public class Postman {

    public void hasAccessTo() {
        Parent parent = new Parent();
        System.out.println(parent.phoneNo);
    }
}
