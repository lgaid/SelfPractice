package shortVideo_practice_review;

import java.util.Scanner;

public class LongestString {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the first sentence");
        String str1 = input.nextLine();

        System.out.println("Enter the second sentence");
        String str2 = input.nextLine();

        input.close();
            if (str1.length() > str2.length()) {
                System.out.println(str1);
            } else if (str2.length() > str1.length()) {
                System.out.println(str2);
            }else{
                System.out.println(" Equal");
            }





    }


}
/*
1. Create a class named LongestString
            1.1 Ask the user to enter two strings
            1.2 Write a program that can print the longest string,
            if both have the same number of characters then print "Equal"

    2. Create a class named LogIn
            2.1 Ask the user to enter the username & password
            2.2 print "You are not logged in" If user entered valid username and password
                otherwise print the error message "Incorrect username or password. Please try again"

            Note: Assume that the valid credentials are:
                        username: Cydeo
                        password: WoodenSpoon

    3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
            - if the word starts with digits, print "first character is digit"
            - if the word starts with uppercase letters, print "first character is lowercase letter"
            - if the word starts with lowercase letters, print "first character is uppercase letter"
            - if the word starts with special characters, print "first character is special character"


            HINT: You need to check the ascii table
 */