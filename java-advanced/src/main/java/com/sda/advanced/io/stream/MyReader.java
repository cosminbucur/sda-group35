package com.sda.advanced.io.stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class MyReader {

    public void readFromResources() {
        InputStream inputStream = this.getClass()
                .getResourceAsStream("/people.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Stream<String> lines = bufferedReader.lines();
        lines.forEach(line -> System.out.println(line));
    }

    public void readFromResourcesClassLoader() {
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("people.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Stream<String> lines = bufferedReader.lines();
        lines.forEach(line -> System.out.println(line));
    }
}
