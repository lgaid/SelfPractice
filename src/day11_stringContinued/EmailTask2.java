package day11_stringContinued;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your email address");
        String email = input.next();
        String result = "Unchanged: " + email;

        String firstName ="";
        String lastName = "";
        String domain = "";

        if (email.contains("_")){
            firstName = email.substring(0,email.indexOf("_"));
            lastName = email.substring(email.indexOf("_") + 1, email.lastIndexOf("@"));
            domain = email.substring(email.lastIndexOf("@") + 1, email.lastIndexOf("."));

            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

            result = "First Name: " + firstName + "\nLast Name: " + lastName + "\nDomain: " + domain;

        } else if (! email.contains("@")) {
            result = "Invalid email";

        }
        System.out.println(result);

    }


}
/*
 9. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and
       followed by an underscore and last name.

       Write a program that will print out information about user based on email.
       Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter
       and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */