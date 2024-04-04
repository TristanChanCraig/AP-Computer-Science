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
            String path = "C:\\Users\\chan.t3\\IdeaProjects\\AP-Computer-Science\\src\\Quarter4\\LibraryManagementLab\\book_catalog.csv";  // Change directory as needed
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
                System.out.print("Enter name: ");
                String name = input.next();
                System.out.print("Enter patron ID: ");
                String pID = input.next();
                l.addPatron(new Patron(name, pID));
                System.out.println("Patron added successfully.");
            } else if (choice == 2) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter title: ");
                String title = input.next();
                System.out.print("Enter author: ");
                String author = input.next();
                l.addBook(new Book(title, isbn, author));
                System.out.println("Book added successfully.");
            }
            else if (choice == 3) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                l.removeBook(isbn);
                System.out.println("Book removed successfully.");
            }
            else if (choice == 4) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter patron ID: ");
                String pID = input.next();
                l.checkoutBook(isbn, pID);
                System.out.println("Book checked out successfully.");
            }
            else if (choice == 5) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter patron ID: ");
                String pID = input.next();
                l.checkinBook(isbn, pID);
                System.out.println("Book checked in successfully.");
            }
            else if (choice == 6) {
                System.out.print("Enter title: ");
                String title = input.next();
                Book bok = l.searchBookByTitle(title);
                System.out.println("Book found: ");
                bok.toString();
            }
            else if (choice == 7) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                l.viewMostRecentTransaction(isbn);
            }
            else if (choice == 8) run = false;
            System.out.println();
        }
    }

    // add each book from the catalog to the library, then display the menu
}
