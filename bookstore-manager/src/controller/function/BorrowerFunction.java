package controller.function;

import controller.display.DisplayBorrower;
import controller.manager.BookBorrowerManager;
import controller.menu.BorrowerMenu;
import model.BookBorrower;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BorrowerFunction {
    public void searchBorrowerbyID(List<BookBorrower> borrowerList) {
        Iterator<BookBorrower> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = borrowerList.iterator();
        while(iterator.hasNext()){
            BookBorrower holder = iterator.next();
            if (Objects.equals(holder.getBorrowerID(), idValue)) {
                DisplayBorrower displayBorrower = new DisplayBorrower();
                BookBorrowerManager bookBorrowerManager = new BookBorrowerManager(holder, displayBorrower);
                bookBorrowerManager.updateDisplayBorrower();
            }
        }
    }
    public void deleteBorrowerByID(List<BookBorrower> borrowerList) {
        Iterator<BookBorrower> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = borrowerList.iterator();
        while (iterator.hasNext()) {
            BookBorrower holder = iterator.next();
            if (Objects.equals(holder.getBorrowerID(), idValue)) {
                borrowerList.remove(holder);
                break;
            }
        }
    }
    public void editBorrowerByID(List<BookBorrower> borrowerList) throws IOException {
        Iterator<BookBorrower> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = borrowerList.iterator();
        while (iterator.hasNext()) {
            BookBorrower holder = iterator.next();
            if (Objects.equals(holder.getBorrowerID(), idValue)) {
                BorrowerMenu borrowerMenu = new BorrowerMenu();
                BookBorrower newborrower =  borrowerMenu.createBorrowerForm();
                borrowerList.set(borrowerList.indexOf(holder), newborrower);
                break;
            }
        }
    }
}

