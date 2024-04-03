package Quarter4.LibraryManagementLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "LibraryManagementLab/book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog.");
        }
        return new ArrayList<>();
    }

    // Implement main program; make a new Library object, load the catalog,
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library l = new Library();
        ArrayList<Book> b = loadCatalog();
        for (Book k : b) l.addBook(k);
        boolean run = true;
        while (run) {
            System.out.println("Menu:");
            System.out.println("1. Add Patrons");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Checkout Book");
            System.out.println("5. Return Book");
            System.out.println("6. Search Book");
            System.out.println("7. Search Book Transaction");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            if (choice == 1) {

            } else if (choice == 2) {}
            else if (choice == 3) {}
            else if (choice == 4) {}
            else if (choice == 5) {}
            else if (choice == 6) {}
            else if (choice == 7) {}
            else if (choice == 8) run = false;

        }
    }

    // add each book from the catalog to the library, then display the menu
}
