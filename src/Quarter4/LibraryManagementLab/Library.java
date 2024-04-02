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

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {BinarySearchUtil.binarySearchTitle(books, books.size(), 0, book.getTitle()); }
    @Override
    public void removeBook(String isbn) {
        for (int lcv = 0; lcv < books.size(); lcv++)
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.remove(lcv);
                lcv--;
            }
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

    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        Book closestBook = null;
        for (int lcv = 0; lcv < books.size(); lcv++) {
            String currTitle = books.get(lcv).getTitle().toLowerCase();
            if (currTitle.contains(title.toLowerCase())) {
                if (closestBook == null ||
                        Math.abs(currTitle.compareTo(title)) < Math.abs(closestBook.getTitle().compareTo(title))) {}
                closestBook = books.get(lcv);
            }
        }
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
