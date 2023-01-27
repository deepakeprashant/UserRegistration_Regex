package user.registration;

import java.util.Scanner;

public class UserInterface {
    String firstname;
    Scanner scan = new Scanner(System.in);
    String getFirstname(){
        System.out.println("Enter User First Name");
        firstname = scan.next();
        return firstname;
    }
}
