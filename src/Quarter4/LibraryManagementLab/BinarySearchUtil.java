package Quarter4.LibraryManagementLab;

import java.util.ArrayList;

public class BinarySearchUtil {
    public static Book binarySearchTitle(ArrayList<Book> books, int high, int low, String title) {
        if (low > high) return null;
        int mid = (high + low) / 2;
        Book currBook = books.get(mid);
        if (currBook.getTitle().equals(title)) return currBook;
        else if (currBook.getTitle().compareTo(title) > 0) return binarySearchTitle(books, mid - 1, low, title);
        return binarySearchTitle(books, mid + 1, high, title);
    }

    public static Book binarySearchAuthor(ArrayList<Book> books, int high, int low, String author) {
        if (low > high) return null;
        int mid = (high + low) / 2;
        Book currBook = books.get(mid);
        if (currBook.getAuthor().equals(author)) return currBook;
        else if (currBook.getAuthor().compareTo(author) > 0) return binarySearchAuthor(books, mid - 1, low, author);
        return binarySearchAuthor(books, mid + 1, high, author);
    }
}
