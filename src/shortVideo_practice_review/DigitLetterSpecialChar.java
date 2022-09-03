package shortVideo_practice_review;

import java.util.Locale;
import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        char firstLetter = str.charAt(0);

        if (str.equals(str.toLowerCase())){
            System.out.println("first character is lowercase letter ");

        } else if (firstLetter >= '0' && firstLetter <= '9') {
            System.out.println("first character is digit");

        } else if (firstLetter >= 33 && firstLetter >= 47 ) {
            System.out.println("first character is special character");

        }else{
            System.out.println(" string is empty");
        }



    }


}
/*
   3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
            - if the word starts with digits, print "first character is digit"
            - if the word starts with uppercase letters, print "first character is lowercase letter"
            - if the word starts with lowercase letters, print "first character is uppercase letter"
            - if the word starts with special characters, print "first character is special character"


            HINT: You need to check the ascii table
 */
