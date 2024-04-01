package Quarter4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    public Transaction(String isbn, String patronId, String checkoutDate) {
        this.isbn = isbn;
        this.patronId = patronId;
        this.checkoutDate = checkoutDate;
        returnDate = null;
    }
    // TODO: Implement getters and setters
//    public returnBook()

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
