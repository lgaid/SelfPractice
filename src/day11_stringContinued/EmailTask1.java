package day11_stringContinued;

import java.util.Scanner;

public class EmailTask1 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = input.next();

        int underScore = email.indexOf("_");
        int specCharacter = email.indexOf("@");
        String lastName = email.substring(underScore +1,specCharacter);

        if (email.contains("_")){
            email = email.replace(email.substring(underScore + 1,specCharacter), email.substring(0,underScore));

            email = email.replaceFirst(email.substring(0,underScore), lastName);


            System.out.println(email);


        }

        input.close();


    }


}
/*
  8. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */