import java.util.Date;
import java.util.Scanner;

public class Register {

    String userName;
    String regNum;
    String issueDate;
    String returnDate;

    Scanner input = new Scanner(System.in);

    public void registerUser() {

        System.out.println("Enter User Name:");
        this.userName = input.nextLine();

        System.out.println("Enter Reg Number:");
        this.regNum = input.nextLine();

        System.out.println("Enter User issueDate:");
        this.issueDate = input.nextLine();

        System.out.println("Enter User returnDate:");
        this.returnDate = input.nextLine();

    }
}