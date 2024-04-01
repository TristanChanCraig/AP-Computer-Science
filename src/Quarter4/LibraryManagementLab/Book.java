package Quarter4.LibraryManagementLab;

public class Book extends Media {
    private String author;

    public Book(String title, String isbn, String author) {
        super(title, isbn);
        this.author = author;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
