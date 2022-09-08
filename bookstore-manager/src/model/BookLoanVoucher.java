package model;

import java.io.Serializable;
import java.time.LocalDate;

public class BookLoanVoucher implements Serializable {
    private String ID;
    private LocalDate borrowedDate;
    private BookBorrower bookBorrower;
    private Book book;

    public BookLoanVoucher() {
    }

    public BookLoanVoucher(String id,LocalDate borrowedDate, BookBorrower bookBorrower, Book book) {
        this.ID = id;
        this.borrowedDate = borrowedDate;
        this.bookBorrower = bookBorrower;
        this.book = book;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public BookBorrower getBookBorrower() {
        return bookBorrower;
    }

    public void setBookBorrower(BookBorrower bookBorrower) {
        this.bookBorrower = bookBorrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookLoanVoucher{" +
                "borrowedDate=" + borrowedDate +
                ", bookBorrower=" + bookBorrower +
                ", book=" + book +
                '}';
    }
}
