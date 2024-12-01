package com.booklibrary.app;
import java.util.LinkedList;

public class Holder implements Inter {
    
//    @Override
    public LinkedList <String> ISBN(String data){
        LinkedList <String> buffer = new LinkedList<>();
        buffer.add(data);
        return buffer;
    }

//    @Override
    public LinkedList <String> Title(String data){
        LinkedList <String> buffer = new LinkedList<>();
        buffer.add(data);
        return buffer;
    }

//    @Override
    public LinkedList <String> Author(String data){
        LinkedList <String> buffer = new LinkedList<>();
        buffer.add(data);
        return buffer;
    }

//    @Override
    public LinkedList <String> Year(String data){
        LinkedList <String> buffer = new LinkedList<>();
        buffer.add(data);
        return buffer;
    }

//    @Override
    public LinkedList <String> Genre(String data){
        LinkedList <String> buffer = new LinkedList<>();
        buffer.add(data);
        return buffer;
    }

}