package Quarter4.LibraryManagementLab;

public interface LibrarySystem {
    void addBook(Book book);
    void removeBook(String isbn);
    void addPatron(Patron patron);
    void removePatron(String patronId);
    void createTransaction(String isbn, String patronId, String checkoutDate);
    void updateTransaction(String isbn, String patronId, String returnDate);
    void viewMostRecentTransaction(String isbn);
    boolean checkoutBook(String isbn, String patronId);
    boolean checkinBook(String isbn, String patronId);
    Book findClosestBook(String title);
    Book searchBookByTitle(String title);
    Book searchBookByAuthor(String author);
}
