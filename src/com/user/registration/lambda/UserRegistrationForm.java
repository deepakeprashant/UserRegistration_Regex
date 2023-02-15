package com.user.registration.lambda;

import java.util.function.Predicate;

public class UserRegistrationForm {

    public static void main(String[] args) {
        System.out.println("First Name");
        Predicate<String> firstName = i->i.matches("^[A-Z][a-z]{3,9}$");
        System.out.println(firstName.test("Prashant"));

        System.out.println("Last Name");
        Predicate<String> lastName = i->i.matches("^[A-Z][a-z]{3,9}$");
        System.out.println(lastName.test("Deepake"));

        System.out.println("Email Id");
        String regex = "([a-zA-Z0-9][+*.a-zA-Z0-9]*@[a-zA-z0-9]+(([.][a-zA-Z])+))$";
        Predicate<String> email = i->i.matches(regex);
        System.out.println(email.test("deepake@gmail.com"));

        System.out.println("Phone Number");
        Predicate<String> phoneNumber = i->i.matches("^[0-9]{2}[\\s][6-9][0-9]{9}$");
        System.out.println(phoneNumber.test("91 9130590029"));

        System.out.println("Password :- ");
        Predicate<String> password = i->i.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,20}$");
        System.out.println(password.test("Pass@1435"));
    }
}
