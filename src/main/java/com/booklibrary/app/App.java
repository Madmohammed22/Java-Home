package com.booklibrary.app;

class BookLibrary {

    String titlePrograms;

    public BookLibrary(String _titlePrograms) {
        this.titlePrograms = _titlePrograms;
    }

    public void displayBookLibrary() {
        System.err.println(this.titlePrograms);
    }

    public void optionsOfBookLibrary() {
        System.out.println("Choose number:");
        System.err.println("Display all books [1] | " +
                "Search for books by title or author [2] | "
                + " Add new books [3]" +
                " | Remove books [4]");
    }
}


public class App {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary("Book Library");
        bookLibrary.optionsOfBookLibrary();
        bookLibrary.displayBookLibrary();

    }
}

