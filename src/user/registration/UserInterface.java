package user.registration;

import java.util.Scanner;

public class UserInterface {
    String firstName, lastName, emailId, mobileNumber;
    Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    int getUserChoice() {
        System.out.println("1] Full Name Check \n2] Email Id Check\n" +
                           "3] Mobile Number \n4] Exit");
        int choice = scan.nextInt();
        return choice;
    }

    String getFirstName() {
        System.out.println("Enter User First Name");
        firstName = scan.next();
        return firstName;
    }
    String getMobileNumber(){
        System.out.println("Enter Mobile Number");
        mobileNumber = scanner.nextLine();
        return mobileNumber;
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
}
