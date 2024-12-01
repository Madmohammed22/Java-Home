package com.booklibrary.app;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

interface Inter {

    LinkedList <String> ISBN(String data);
    LinkedList <String> Title(String data);
    LinkedList <String> Author(String data);
    LinkedList <String> Year(String data);
    LinkedList <String> Genre(String data);
}

public class ParsFile extends ReadFromFile{

    public static final String ISBN_MACRO = "ISBN";
    public static final String TITLE_MACRO = "Title";
    public static final String AUTHOR_MACRO = "Author";
    public static final String YEAR_MACRO = "Year";
    public static final String GENRE_MACRO = "Genre";

    public LinkedList<Map<String, LinkedList>> dataMap(){
        LinkedList<String> node = (LinkedList<String>) GrepData();
        LinkedList<Map<String, LinkedList>> MapList = new LinkedList<>();
        node = node.stream().skip(1).collect(Collectors
        .toCollection(LinkedList::new));
        Holder holder = new Holder();
        for (String node1 : node) {
            splitEachNode(node1, holder, MapList);
        }
        return MapList;
    }

    void splitEachNode(String data, Holder hold, LinkedList<Map<String, LinkedList>> MapList){
        String[] substr = data.split(",");
        Map<String, LinkedList> MapListHashing = new HashMap<>();
        
        LinkedList <String> ISBN = hold.ISBN(substr[0]);
        LinkedList <String> Title = hold.Title(substr[1]);
        LinkedList <String> Author = hold.Author(substr[2]);
        LinkedList <String> Year = hold.Year(substr[3]);
        LinkedList <String> Genre = hold.Genre(substr[4]);
        
        MapListHashing.put(ISBN_MACRO, ISBN);    
        MapListHashing.put(TITLE_MACRO, Title);    
        MapListHashing.put(AUTHOR_MACRO, Author);    
        MapListHashing.put(YEAR_MACRO, Year);    
        MapListHashing.put(GENRE_MACRO, Genre);
        MapList.add(MapListHashing);
    }
}