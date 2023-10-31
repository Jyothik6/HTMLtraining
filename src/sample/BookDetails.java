import java.util.Scanner;

public class BookDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        // Create an array of 3 Book objects

        Book[] books = new Book[3];

        // Initialize the array of books using user input

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Book Number: ");

            int bookNo = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.print("Title: ");

            String title = scanner.nextLine();

            System.out.print("Author: ");

            String author = scanner.nextLine();

            System.out.print("Price: $");

            float price = scanner.nextFloat();

            scanner.nextLine(); // Consume newline

 

            books[i] = new Book(bookNo, title, author, price);

        }

 

        // Print the book details

        for (Book book : books) {

            System.out.println("\nBook Details:");

            System.out.println(book.toString());

        }

 

        // Search for a book by book number

        System.out.print("\nEnter the book number to search: ");

        int searchBookNo = scanner.nextInt();

 

        // Check if the book exists and print its details or an error message

        boolean bookFound = false;

        for (Book book : books) {

            if (book.getBookNo() == searchBookNo) {

                System.out.println("\nBook Found!\n");

                System.out.println(book.toString());

                bookFound = true;

                break;

            }

        }

 

        if (!bookFound) {

            System.out.println("Book not found. Please enter a valid book number.");

        }

 

        // Print the total number of books

        System.out.println("\nTotal number of books: " + Book.getBookCount());

 

        scanner.close();

    }

}

 