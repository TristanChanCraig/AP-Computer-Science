package Quarter4.LibraryManagementLab;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;
    private ArrayList<Book> authorBooks;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
        transactions = new ArrayList<>();
        authorBooks = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        if (books.size() != 0) {
            for (int lcv = 0; lcv < books.size(); lcv++) {
                if (book.getTitle().compareTo(books.get(lcv).getTitle()) < 0) {
                    books.add(lcv, book);
                    return;
                }
                if (book.getAuthor().compareTo(authorBooks.get(lcv).getAuthor()) < 0) {
                    authorBooks.add(lcv, book);
                    return;
                }
            }
        } else {
            books.add(book);
            authorBooks.add(book);
        }
        if (books.size() == 4983) {
            System.out.println("hi");
        }
    }
    @Override
    public void removeBook(String isbn) {
        for (int lcv = 0; lcv < books.size(); lcv++)
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.remove(lcv);
                lcv--;
            }
    }

    @Override
    public void addPatron(Patron patron) { patrons.add(patron); }

    @Override
    public void removePatron(String patronId) {
        for (int lcv = 0; lcv > patrons.size(); lcv++)
            if (patrons.get(lcv).getPatronId().equals(patronId)) patrons.remove(lcv);
    }

    @Override
    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        Transaction t = new Transaction(isbn, patronId, checkoutDate);
        transactions.add(t);
    }

    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {
        for (Transaction t : transactions)
            if (t.getIsbn().equals(isbn) && t.getPatronId().equals(patronId)) t.returnBook(returnDate);
    }

    @Override
    public void viewMostRecentTransaction(String isbn) {
        for (int lcv = transactions.size() - 1; lcv >= 0; lcv--) {
            if (transactions.get(lcv).getIsbn().equals(isbn)) {
                System.out.println(transactions.toString());
            } else if (lcv == 0) System.out.println("No transactions found for ISBN: " + isbn);
        }
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        createTransaction(isbn, patronId, getDateToday());
        for (int lcv = 0; lcv < books.size(); lcv++)
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.get(lcv).setCheckedOut(true);
            } else if (lcv == books.size() - 1) System.out.println("Can't find book!");
        return true;
    }

    @Override
    public boolean checkinBook(String isbn, String patronId) {
        updateTransaction(isbn, patronId, getDateToday());
        for (int lcv = 0; lcv < books.size(); lcv++)
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.get(lcv).setCheckedOut(false);
            } else if (lcv == books.size() - 1) System.out.println("Can't find book!");
        return true;
    }

    // Complete the implementation of LibrarySystem methods
    // Implement searchBookByTitle and searchBookByAuthor using binary search


    @Override
    public Book findClosestBook(String title) {
        // Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        Book closestBook = null;
        for (int lcv = 0; lcv < books.size(); lcv++) {
            Book currBook = books.get(lcv);
            if (title.toLowerCase().contains(currBook.getTitle().toLowerCase())) return currBook;
        }
        return null;
    }

    @Override
    public Book searchBookByTitle(String title) {
        // Binary search for book; if not found, return the closest book
        if (BinarySearchUtil.binarySearchTitle(books, books.size(), 0, title) != null) {
            return BinarySearchUtil.binarySearchTitle(books, books.size(), 0, title);
        } else return findClosestBook(title);
    }

    @Override
    public Book searchBookByAuthor(String author) {
        if (BinarySearchUtil.binarySearchAuthor(authorBooks, authorBooks.size(), 0, author) != null) {
            return BinarySearchUtil.binarySearchAuthor(authorBooks, authorBooks.size(), 0, author);
        } else return null;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
