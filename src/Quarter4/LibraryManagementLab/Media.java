package Quarter4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    public Media(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // TODO: Implement getter methods
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
