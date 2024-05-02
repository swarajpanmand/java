package psoop;

import java.util.Scanner;
import java.util.ArrayList;

class Book{
    String title;
    String author;
    int year;
    
    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
    }

    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }

}

public class que9_1 {
    
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a book");
            System.out.println("2. Display books");
            System.out.println("3. Search a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    sc.nextLine(); // Consume newline
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    books.add(new Book(title, author, year));
                    break;
                case 2:
                    displayBooks(books);
                    break;
                case 3:
                    searchBook(books);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }

    private static void displayBooks(ArrayList<Book> books){
        for (Book book : books) {
            book.display();
        }
    }
    private static void searchBook(ArrayList<Book> books){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the title of the book you want to search: ");
        String title = sc.nextLine();
        boolean found = false;
        for (Book book : books){
            if(book.getTitle().equals(title)){
                book.display();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
    }
}
