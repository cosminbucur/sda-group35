package com.sda.advanced.oop.enums;

public class DemoEnums2 {

    public static void main(String[] args) {
        Hero assassin = new Hero(500, Role.ASSASSIN);
        Role assassinRole = assassin.getRole();
        String assassinDescription = assassinRole.getDescription();
        System.out.println("assassinDescription: " + assassinDescription);

        System.out.println("name() -> " + Role.ASSASSIN.name());
        System.out.println("ordinal() -> " + Role.ASSASSIN.ordinal());

        System.out.println("valueOf() -> " + Role.valueOf("ASSASSIN"));
        System.out.println("valueOf non existing() -> " + Role.valueOf("CEVA"));
        Role[] roleValues = Role.values();

        // for loop
        // for ( from; to; increment step )
        for (int i = 0; i < roleValues.length; i++) {
            // display enum description
            Role roleValue = roleValues[i];
            String description = roleValue.getDescription();
            System.out.println(description);
        }

        // enhanced for
        // for (item: collection)
        for (Role role : roleValues) {
            System.out.println(role.getDescription());
        }

        System.out.println("values() -> " + roleValues);
    }
}
