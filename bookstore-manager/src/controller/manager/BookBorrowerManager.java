package controller.manager;


import controller.display.DisplayBorrower;
import model.BookBorrower;




public class BookBorrowerManager {
    private BookBorrower model;
    private DisplayBorrower view;

    public BookBorrowerManager(BookBorrower model, DisplayBorrower view) {
        this.model = model;
        this.view = view;
    }
    public String getBorrowerID() {
        return model.getBorrowerID();
    }
    public String getBorrowerName() {
        return model.getBorrowerName();
    }
    public String getAddress() {
        return model.getAddress();
    }
    public String getPhoneNumber() {
        return model.getPhoneNumber();
    }
    public String getEmail() {
        return model.getEmail();
    }
    public void updateDisplayBorrower() {
        view.displayBorrower(model.getBorrowerID(), model.getBorrowerName(), model.getAddress(), model.getPhoneNumber(), model.getEmail());
    }
}
