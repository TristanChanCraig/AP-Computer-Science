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
                input.nextLine();
                String pID = input.next();
                l.addPatron(new Patron(name, pID));
                System.out.println("Patron added successfully.");
            } else if (choice == 2) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter title: ");
                input.nextLine();
                String title = input.nextLine();
                System.out.print("Enter author: ");
                String author = input.nextLine();
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
                input.nextLine();
                String title = input.nextLine();
                Book bok = l.searchBookByTitle(title);
                System.out.println("Book found: ");
                System.out.println(bok.toString());
            }
            else if (choice == 7) {
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                l.viewMostRecentTransaction(isbn);
            }
            else if (choice == 8) run = false;
            else if (choice == 9) l.printAllBooks();
            System.out.println();
        }
    }

    // add each book from the catalog to the library, then display the menu
}
/*
Loading catalog...success.
Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 1
Enter name: mareek schard
Enter patron ID: 21
Patron added successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 2
Enter ISBN: 23
Enter title: john a punny buy
Enter author: mareek scharly
Book added successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 3
Enter ISBN: 0451628640
Book removed successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 4
Enter ISBN: 23
Enter patron ID: 21
Can't find book!
Book checked out successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 5
Enter ISBN: 23
Enter patron ID: 21
Can't find book!
Book checked in successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 6
Enter title: john a punny buy
Book found:
Book{title='john a punny buy', isbn='23', author='mareek scharly'}

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 7
Enter ISBN: 23
[Transaction{isbn='23', patronId='21', checkoutDate='2024-04-11', returnDate='2024-04-11'}]

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 8
 */

/*
C:\Users\chan.t3\.jdks\openjdk-20.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=62793:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\chan.t3\IdeaProjects\AP-Computer-Science\out\production\Desktop Quarter4.LibraryManagementLab.LibraryManager
Loading catalog...success.
Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 1
Enter name: Joe
Enter patron ID: 123
Patron added successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 6
Enter title: Basic Nursing
Book found:
Book{title='Basic Nursing: Theory and Practice', isbn='0801678765', author='Patricia A. Potter'}

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 4
Enter ISBN: 0801678765
Enter patron ID: 123
Can't find book!
Book checked out successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 7
Enter ISBN: 0801678765
[Transaction{isbn='0801678765', patronId='123', checkoutDate='2024-04-11', returnDate='null'}]

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 5
Enter ISBN: 0801678765
Enter patron ID: 123
Can't find book!
Book checked in successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 7
Enter ISBN: 0801678765
[Transaction{isbn='0801678765', patronId='123', checkoutDate='2024-04-11', returnDate='2024-04-11'}]

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 2
Enter ISBN: 1122334455
Enter title: Testing User Interfaces 101
Enter author: George Oregon
Book added successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 3
Enter ISBN: 1122334455
Book removed successfully.

Menu:
1. Add Patrons
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter choice: 8
 */