package com.booklibrary.app;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

interface InnerMethodsBookLibrary {

    boolean dispplayAllBook();

    boolean searchOnBook();

    boolean addBook(String dataInput);

    boolean removeBook(String dataInput);
}

class implementsMethods implements InnerMethodsBookLibrary {
    @Override
    boolean displayBookLibrary() {
        for (Map<String, LinkedList> current : targer) {
            System.out.println(current.get(TITLE_MACRO).stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")));
        }
        return true;
    }

    @Override
    boolean searchOnBook(){
        return true;
    }
}



public class MethodsBookLibrary extends ParsFile {

    public void proccessInput(String dataInput) {
        LinkedList<Map<String, LinkedList>> targer = dataMap();
        if (dataInput.equals("1")) {
            for (Map<String, LinkedList> current : targer) {
                System.out.println(current.get(TITLE_MACRO).stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(", ")));
            }
        } else if (dataInput.equals("2")) {

            Scanner Input = new Scanner(System.in);
            System.err.println("With Book name [1] | with Author name [2]");
            String name = Input.nextLine();
            boolean check = false;
            if (name.equals("1")) {
                System.out.println("Inter Book name : ");
                name = Input.nextLine();
                for (Map<String, LinkedList> current : targer) {
                    if (current.containsKey(TITLE_MACRO) && current.get(TITLE_MACRO).contains(name)) {
                        System.out.println("Found '" + current.get(TITLE_MACRO)
                                .stream().map(Object::toString).collect(Collectors.joining(", ")) + "'");
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if (check == false) {
                    System.out.println("Not Found '" + name + "'");
                }

            } else if (name.equals("2")) {
                System.out.println("Inter Author name : ");
                name = Input.nextLine();
                for (Map<String, LinkedList> current : targer) {
                    if (current.containsKey(AUTHOR_MACRO) && current.get(AUTHOR_MACRO).contains(name)) {
                        System.out.println("Found '" + current.get(AUTHOR_MACRO).stream()
                                .map(Object::toString).collect(Collectors.joining(", ")) + "'");
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if (check == false) {
                    System.out.println("Not Found '" + name + "'");
                }

            }
        } else if (dataInput.equals("5")) {

        }
    }
}
