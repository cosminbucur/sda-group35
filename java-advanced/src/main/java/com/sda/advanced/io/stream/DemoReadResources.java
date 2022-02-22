package com.sda.advanced.io.stream;

public class DemoReadResources {

    public static void main(String[] args) {
        MyReader myReader = new MyReader();
//        myReader.readFromResources();

        myReader.readFromResourcesClassLoader();
    }
}
