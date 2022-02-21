package com.sda.advanced.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {

    public static void main(String[] args) {
        readUsingBufferedReader();
    }

    public static void readUsingBufferedReader() {
        // try with resources
        try (FileReader fileReader = new FileReader("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/people.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            int letter;
            while ((letter = bufferedReader.read()) != -1) {
                System.out.print((char) letter);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void readUsingBufferedReaderBasic() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\testout.txt");
            bufferedReader = new BufferedReader(fileReader);
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
