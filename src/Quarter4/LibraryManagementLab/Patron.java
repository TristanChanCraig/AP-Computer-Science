package Quarter4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        checkedOutBooks = new ArrayList<>();
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    public void checkInBook(Book book) {
        checkedOutBooks.add(book);
        book.setCheckedOut(true);
    }

    public void checkOutBook(Book book) {
        checkedOutBooks.remove(book);
        book.setCheckedOut(false);
    }
}
