import java.util.ArrayList;
import java.lang.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Book {


    private static Object Book;
    String bookName, firstAuthor, secondAuthor;
    private Book[] borrowedBooks;
    private int booksCount;

    private Object User;

    public Book(String name, String firstAuthor, String secondAuthor) {

        this.bookName = name;
        this.firstAuthor = firstAuthor;
        this.secondAuthor = secondAuthor;

    }

    public Book() {

    }

    ///*
    public int issueBook() {

        int userIndex = this.booksCount;
        if (userIndex != 1) {
            //userIndex.showAllBooks();
            int book = Book.issueBook();
            System.out.println("Issuing book ");
            if (Book != null) {

                Book[] book1 = new Book[10];
                if (book1[userIndex].booksCount <= 3) {
                    book1[userIndex].borrowedBooks[book1[userIndex].booksCount] = book1;
                    book1[userIndex].booksCount = book1[userIndex].booksCount;
                    return 1;

                } else {

                    System.out.println("User Can not Borrow more than 3 Books.");
                    return 0;

                }
            }
            System.out.println("Book is not Available.");

        }
        return 1;

    }

    //*/
    public void searchByAuthorName() {
        System.out.println("\tSEARCH BY AUTHOR'S NAME");
        Scanner input = null;
        Objects.requireNonNull(input).nextLine();
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("\tName\t\tAuthor\t");
        int count = 0;
        for (int i = 0; i < count; i++) {

            Book[] theBooks = new Book[0];
            if (authorName.equalsIgnoreCase(theBooks[i].firstAuthor)) {

                System.out.println(theBooks[i].bookName + "\t\t" + theBooks[i].firstAuthor);
                flag++;
            }

        }
        if (flag == 0)
            System.out.println("No Books of " + firstAuthor + " Found.");

    }


    public void showAllBooks() {
        List<Book> list = new ArrayList<Book>();

        Book b1 = new Book("Let us C", "Yashwant Kanetkar", "");
        Book b2 = new Book("Data Communications and Networking", "Forouzan", "Mc Graw Hill");
        Book b3 = new Book("Operating System", "Galvin", "Wiley");
        Book b4 = new Book("Data Structure", "Adsul Alpana", "shyam gote");

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        System.out.println("Available Books Lists : ");
        for (Book b : list) {
            System.out.println("BookName: " + b.bookName + "\tFirstAuthor : " + b.firstAuthor + " \tSecondAuthor  :" + b.secondAuthor);
        }

    }

    private int isBook() {
        return 0;
    }


    public void addBook() {


    }

    public void searchByBookName() {
    }
}

