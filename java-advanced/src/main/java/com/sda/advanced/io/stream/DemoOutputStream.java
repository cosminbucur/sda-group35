package com.sda.advanced.io.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class DemoOutputStream {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("alex");
        person.setLastName("vasile");

        // use output stream to write to a file
        File file = new File("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/person.txt");

        try(OutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            System.out.println("writing complete");
        } catch (IOException e) {
            System.out.println("error writing to file");
        }

    }
}
