package controller.menu;

import model.BookBorrower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class BorrowerMenu {
    public BookBorrower createBorrowerForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW BORROWER<<<<<<<<<");
        System.out.print("1. Enter Borrower ID: ");
        String id = bufferedReader.readLine();
        System.out.print("1. Enter Borrower Name: ");
        String name = bufferedReader.readLine();
        System.out.print("1. Enter Borrower Address: ");
        String address = bufferedReader.readLine();
        System.out.print("1. Enter Borrower Phone number: ");
        String phonenumber = bufferedReader.readLine();
        System.out.print("1. Enter Borrower Email: ");
        String email = bufferedReader.readLine();

        BookBorrower newBorrower = new BookBorrower(id,name,address,phonenumber,email);
        return newBorrower;
    }
    public int menu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("             BORROWER MANAGER            ");
        System.out.println("-------------------***-------------------");
        System.out.println("|    1. Add Borrower.                   |");
        System.out.println("|    2. Edit Borrower by ID.            |");
        System.out.println("|    3. Remove Borrower by ID.          |");
        System.out.println("|    4. Display Borrower.               |");
        System.out.println("|    5. Search Borrower by ID.          |");
        System.out.println("|    6. Save Borrower to database.      |");
        System.out.println("|    7. Load Borrower from database.    |");
        System.out.println("|    8. Back Main menu.                 |");
        System.out.println("|    0. Exit program.                   |");
        System.out.println("-----------------------------------------");
        System.out.print("  Select function: ");
        int option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllStaffs(List<BookBorrower> borrowerList) {
        System.out.println("############################ DISPLAY ALL GUESTROOM ##############################");
        Iterator<BookBorrower> iterator = borrowerList.iterator();
        while (iterator.hasNext()) {
            BookBorrower holder = iterator.next();
            System.out.printf("%-5s%-10s%-15s%-15s%-20s\n", holder.getBorrowerID(),holder.getBorrowerName(),holder.getAddress(),
                    holder.getPhoneNumber(),holder.getEmail());
        }
        System.out.println("......................................................................................");
    }
}
