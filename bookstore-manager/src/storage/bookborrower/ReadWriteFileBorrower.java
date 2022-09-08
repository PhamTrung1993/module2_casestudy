package storage.bookborrower;

import model.BookBorrower;
import storage.book.ReadWriteFileBook;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFileBorrower implements IReadWriteBorrower {
    private static final String fileName = "bookbrrower.txt";
    private static ReadWriteFileBorrower instance = null;

    public ReadWriteFileBorrower() {
    }
    public static ReadWriteFileBorrower getInstance() {
        if (instance == null) instance = new ReadWriteFileBorrower();
        return instance;
    }
    @Override
    public List<BookBorrower> readData() {
        List<BookBorrower> bookBorrowerList = new LinkedList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.err.println("Can't open file or can't find file");
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException exception) {
            exception.printStackTrace();
            System.err.println("Can't open file or can't find file");
        }
        Object obj = null;
        try {
            obj = ois.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        bookBorrowerList = (List<BookBorrower>) obj;
        System.out.println("Load finish!");
        return bookBorrowerList;
    }

    @Override
    public void writeData(List<BookBorrower> bookBorrowers) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookBorrowers);
            oos.close();
            fos.close();
            System.out.println("Save finish!");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
