package com.sda.advanced.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DemoNio {

    public static void main(String[] args) {
        // path
        // paths - utility class for paths
        // files - utility class for files

        // create list
        List<String> names = Arrays.asList("one", "two", "three");

        // where to write
        Path path = Paths.get("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/output.txt");

        try {
            Files.write(path, names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
