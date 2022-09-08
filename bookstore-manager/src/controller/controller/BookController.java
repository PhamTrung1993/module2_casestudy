package controller.controller;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {
    private String name;
    public static List<Book> bookList = new ArrayList<>();
    public void addNewBook(Book book) {
        bookList.add(book);
    }
    public void editBook(int index,Book book){
        bookList.set(index,book);
    }

    public BookController(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    public BookController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
