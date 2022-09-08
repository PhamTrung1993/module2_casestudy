package storage.bookclass;

import model.BookBorrower;
import model.BookClass;
import storage.bookborrower.ReadWriteFileBorrower;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFileBookClass implements IReadWriteBookClass {
    public static final String fileName = "bookclass.txt";
    private static ReadWriteFileBookClass instance = null;

    public ReadWriteFileBookClass() {
    }
    public static ReadWriteFileBookClass getInstance() {
        if (instance == null) instance = new ReadWriteFileBookClass();
        return instance;
    }
    @Override
    public List<BookClass> readData() {
        List<BookClass> bookClassList = new LinkedList<>();
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
        bookClassList = (List<BookClass>) obj;
        System.out.println("Load finish!");
        return bookClassList;
    }

    @Override
    public void writeData(List<BookClass> bookClasses) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookClasses);
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
