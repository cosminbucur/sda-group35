package com.sda.advanced.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class DemoBufferedWriter {

    public static void main(String[] args) {
        writeUsingBufferedWriter();
    }

    public static void writeUsingBufferedWriter() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Maria");
        nameList.add("Alexandru");
        nameList.add("Diana");

        File file = new File("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/nameList.txt");

        // use buffered writer to write
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            for (String name : nameList) {
                bufferedWriter.write(name + "\n");
            }
        } catch (IOException e) {
            System.out.println("failed to write to file");
        }
    }
}
