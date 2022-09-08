package controller.controller;

import model.Book;
import model.BookClass;


import java.util.LinkedList;
import java.util.List;

public class BookClassController {
    private String name;
    public static List<BookClass> bookClassList = new LinkedList<>();
    public void addNewBookClass(BookClass bookClass) {
        bookClassList.add(bookClass);
    }
    public void editBookClass(int index,BookClass bookClass){
        bookClassList.set(index,bookClass);
    }

    public BookClassController(String name, List<BookClass> bookClasses) {
        this.name = name;
        this.bookClassList = bookClasses;
    }

    public BookClassController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<BookClass> getBookClassList() {
        return bookClassList;
    }

    public void setBookClassList(List<BookClass> bookClasses) {
        this.bookClassList = bookClasses;
    }
}
