package com.sda.advanced.io.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {

    public static void main(String[] args) throws IOException {
        Properties appProperties = new Properties();
        appProperties.load(new FileInputStream("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/app.properties"));
        System.out.println(appProperties);
    }
}
