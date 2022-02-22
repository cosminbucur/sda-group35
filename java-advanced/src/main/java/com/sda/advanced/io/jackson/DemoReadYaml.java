package com.sda.advanced.io.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class DemoReadYaml {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        // API - application programming interface
        try {
            User user = objectMapper.readValue(
                    new File("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/user.yml"),
                    User.class);
            System.out.println(user);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
