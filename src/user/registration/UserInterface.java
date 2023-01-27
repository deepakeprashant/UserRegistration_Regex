package user.registration;

import java.util.Scanner;

public class UserInterface {
    String firstName, lastName, emailId, mobileNumber,password;
    Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    int getUserChoice() {
        System.out.println("Enter 1] Full Name Check \nEnter 2] Email Id Check\n" +
                           "Enter 3] Mobile Number\nEnter 4] Password\nEnter 5] Exit");
        int choice = scan.nextInt();
        return choice;
    }

    String getFirstName() {
        System.out.println("Enter User First Name");
        firstName = scan.next();
        return firstName;
    }
    String getLastName() {
        System.out.println("Enter User Last Name");
        lastName = scan.next();
        return lastName;
    }
    String getEmailId() {
        System.out.println("Enter User Email Id");
        emailId = scan.next();
        return emailId;
    }
    String getMobileNumber(){
        System.out.println("Enter User Mobile Number");
        mobileNumber = scanner.nextLine();
        return mobileNumber;
    }
    String getPassword(){
        System.out.println("Enter Password");
        password = scanner.nextLine();
        return password;
    }
}
