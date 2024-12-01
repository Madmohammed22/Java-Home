package com.booklibrary.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadFromFile {

    public LinkedList<String> GrepData() {
        String data;
        LinkedList<String> buffer = new LinkedList<>();
        File file = new File("sample-books-data.txt");
        try (Scanner read = new Scanner(file)) {
            while (read.hasNextLine()) {

                data = read.nextLine();
                buffer.add(data);
            }
        } catch (FileNotFoundException e) {
            System.err.println("An Error occurred");
        }
        return buffer;
    }
}
