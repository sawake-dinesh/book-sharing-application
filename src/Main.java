import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*****WELCOME TO BOOK SHARING APPLICATION !*****");
        System.out.println("Please Select From The Following Options:\n ");

        Register register = new Register();
        User user = new User();
        Book book = new Book();

        int choice;
        int searchChoice;

        do {

            user.displayMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    User a = new User();
                    book.addBook();
                    break;

                case 2:
                    System.out.println("Enter 1 to Search with BookName.");
                    System.out.println("Enter 2 to Search with Author Name(Full Name).");
                    searchChoice = input.nextInt();

                    switch (searchChoice) {

                        case 1:
                            user.searchByBookName();
                            break;
                        case 2:
                            user.searchByAuthorName();
                    }
                    break;
                case 3:
                    book.showAllBooks();
                    break;
                case 4:
                    User s = new User();
                    user.addUser();
                    break;
                case 5:
                    user.showAllUser();
                    break;
//                case 6:
//                    book.issueBook();
//                    break;
                case 7:
                    user.returnBook();
                    break;

                default:
                    System.out.println("CHOICE SHOULD BE BETWEEN 0 TO 7.");
            }
        }
        while (choice != 0);
    }
}


