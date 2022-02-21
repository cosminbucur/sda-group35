package com.sda.advanced.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DemoCsv {

    public static void main(String[] args) {
        try {
            loadInvoices("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/file.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Invoice> loadInvoices(String path) throws IOException {
        // read file
        List<String> lines = Files.readAllLines(Paths.get(path));

        List<Invoice> invoices = new ArrayList<>();

        // iterate lines, ignore first
        // for each line, create invoice
        for (int i = 1; i < lines.size(); i++) {
            // split by ","
            String[] properties = lines.get(i).split(",");

            // create into invoice
            Invoice invoice = new Invoice();
            invoice.name = properties[0];
            invoice.invoiceNumber = properties[1];
            invoice.invoiceValue = Integer.valueOf(properties[2]);
            invoice.dueDate = LocalDate.parse(properties[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            invoices.add(invoice);
        }
        return invoices;
    }
}
