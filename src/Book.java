import java.util.ArrayList;
import java.util.List;

class Book {

    String bookName, firstAuthor, secondAuthor;

    public Book(String name, String firstAuthor, String secondAuthor) {

        this.bookName = name;
        this.firstAuthor = firstAuthor;
        this.secondAuthor = secondAuthor;

    }
}

class ArrayListExample {
    public static void main(String[] args) {

        //Creating list of Books
        List<Book> list = new ArrayList<Book>();
        //Creating Books
        Book b1 = new Book("Let us C", "Yashwant Kanetkar", "");
        Book b2 = new Book("Data Communications and Networking", "Forouzan", "Mc Graw Hill");
        Book b3 = new Book("Operating System", "Galvin", "Wiley");
        Book b4 = new Book("Data Structure", "Adsul Alpana", "shyam gote");
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        //Traversing list
        for (Book b : list) {
            System.out.println("BookName: " + b.bookName + "   FirstAuthor : " + b.firstAuthor + "  SecondAuthor  :" + b.secondAuthor);
        }
    }
}

