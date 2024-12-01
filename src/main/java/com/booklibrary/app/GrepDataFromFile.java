package com.booklibrary.app;
import java.util.LinkedList;

public class GrepDataFromFile extends ReadFromFile{
    public void displayData(){
        LinkedList<String> list = GrepData();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
