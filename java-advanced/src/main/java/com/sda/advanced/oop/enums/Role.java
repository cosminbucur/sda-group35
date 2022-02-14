package com.sda.advanced.oop.enums;

public enum Role {
    FIGHTER("sword ready"),
    ASSASSIN("poison ready"),
    WIZARD("spell ready");

    private String description;

    private Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}