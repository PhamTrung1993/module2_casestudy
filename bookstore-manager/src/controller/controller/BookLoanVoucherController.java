package controller.controller;

import model.BookLoanVoucher;

import java.util.LinkedList;
import java.util.List;

public class BookLoanVoucherController {
    private String name;
    public static List<BookLoanVoucher> bookLoanVoucherList = new LinkedList<>();
    public void addNewBookLoanVoucher(BookLoanVoucher bookLoanVoucher) {
        bookLoanVoucherList.add(bookLoanVoucher);
    }
    public void editBookLoanVoucher(int index,BookLoanVoucher bookLoanVoucher){
        bookLoanVoucherList.set(index,bookLoanVoucher);
    }

    public BookLoanVoucherController(String name, List<BookLoanVoucher> bookLoanVoucherList) {
        this.name = name;
        this.bookLoanVoucherList = bookLoanVoucherList;
    }

    public BookLoanVoucherController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<BookLoanVoucher> getBookLoanVoucherList() {
        return bookLoanVoucherList;
    }

    public void setBookLoanVoucherList(List<BookLoanVoucher> bookLoanVoucherList) {
        this.bookLoanVoucherList = bookLoanVoucherList;
    }
}
