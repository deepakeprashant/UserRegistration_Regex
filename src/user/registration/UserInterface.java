package user.registration;

import java.util.Scanner;

public class UserInterface {
    String firstName,lastName;
    Scanner scan = new Scanner(System.in);
    String getFirstName(){
        System.out.println("Enter User First Name");
        firstName = scan.next();
        return firstName;
    }
    String getLastName(){
        System.out.println("Enter User Last Name");
        lastName = scan.next();
        return lastName;
    }
}
