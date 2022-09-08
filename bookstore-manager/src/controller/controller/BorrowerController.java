package controller.controller;

import model.BookBorrower;

import java.util.LinkedList;
import java.util.List;

public class BorrowerController {
    private String name;
    public static List<BookBorrower> borrowerList = new LinkedList<>();
    public void addNewBorrower(BookBorrower borrower) {
        borrowerList.add(borrower);
    }
    public void editBorrower(int index,BookBorrower borrower){
        borrowerList.set(index,borrower);
    }

    public BorrowerController(String name, List<BookBorrower> borrowerList) {
        this.name = name;
        this.borrowerList = borrowerList;
    }

    public BorrowerController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<BookBorrower> getBorrowerList() {
        return borrowerList;
    }

    public void setBorrowerList(List<BookBorrower> borrowerList) {
        this.borrowerList = borrowerList;
    }
}
