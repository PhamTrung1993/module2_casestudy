package view.show;

import model.BookBorrower;
import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class ShowBorrower {
    private static final int BACK_MAIN_MENU = 8;
    private static final int LOAD_DATA_CODE = 7;
    private static final int SAVE_DATA_CODE = 6;
    private static final int SEARCH_BORROWER_BY_ID = 5;
    private static final int DISPLAY_ALL_BORROWER = 4;
    private static final int REMOVE_BORROWER_BY_ID = 3;
    private static final int EDIT_BORROWER_BY_ID = 2;
    private static final int ADD_BORROWER = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    private static final int INIT_VALUE = -1;
    public static List<BookBorrower> initBorrower() {
        List<BookBorrower> borrowerList = new ArrayList<>();
        BookBorrower borrower1 = new BookBorrower("C01","Mun","Hà Tây","0912121212","Mun@gmail.com");
        borrowerList.add(borrower1);
        return borrowerList;
    }
}
