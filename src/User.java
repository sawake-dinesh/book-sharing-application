import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User extends Book {


    public Book[] borrowedBooks;
    public int booksCount;
    private String firstName;
    private String lastName;


    public User(String firstName, String lastName) {
        super();

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
        super();
    }

    void showAllUser() {
        List<User> list = new ArrayList<User>();

        User user1 = new User("Dinesh", "Sawake");
        User user2 = new User("Mahesh", "kadam");
        User user3 = new User("Sandesh", "Tonge");
        User user4 = new User("Ganesh", "Kane");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        System.out.println("\nUsers Information : ");

        for (User user : list) {
            System.out.println("firstName: " + user.firstName + "\tLastName : " + user.lastName);
        }

    }

    public void displayMenu() {
        System.out.println("\n=====================");
        System.out.println("Enter 1 for Add Book : ");
        System.out.println("Enter 2 for Search Book :");
        System.out.println("Enter 3 for Show All Book :");
        System.out.println("Enter 4 for Add User: ");
        System.out.println("Enter 5 for Show All User :");
        System.out.println("Enter 6 for Issue a Book :");
        System.out.println("Enter 7 for return a Book:");
        System.out.println("=====================\n");

    }


    public void returnBook() {
//
//        int bookIndex = this.issueBook();
//        if (bookIndex != -1) {
//            System.out.println("\tBook Name \tFirstAuthor Name \tSecondAuthor Name");
//            Book[] theBook = new User[0];
//            Book book = theBook[bookIndex];
//            for (int i = 0; i < book.booksCount; i++) {
//
//                System.out.println(book.borrowedBooks[i].bookName + "\t\t\t" +
//                        book.borrowedBooks[i].firstAuthor + "\t\t" + book.borrowedBooks[i].secondAuthor);
//
//            }
//
//        }
//
//
//        return bookIndex;
//    }
    }


    public void addUser() {
    }

}

