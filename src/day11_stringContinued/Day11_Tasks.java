package day11_stringContinued;

import java.util.Scanner;

public class Day11_Tasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the website");

        String website = input.next();

       if (website.startsWith("www.") && website.endsWith(".com")
               || website.endsWith(".edu") || website.endsWith(".gov")){
           System.out.println("Valid website");

       }else{
           System.out.println("Invalid website");
       }


        System.out.println("Please enter a word");
       String word = input.next();
       word = word.replace("x","a");

        System.out.println(word);

        System.out.println("Please enter a word");
        String word1 = input.next();
        word1 = word1.replace("x","X");

        System.out.println(word1);

        System.out.println("----------------------------------");

        System.out.println("Please enter a word");
        String word2 = input.next();

        if (word2.endsWith("ly")){
            System.out.println("Really???");
        }else{
            System.out.println("Never mind");
        }


        System.out.println("-------------------------------");


        System.out.println("Please enter a word");
        String first = input.next();

        System.out.println("Please enter a second word");
        String second = input.next();

        System.out.println(first.substring(1,first.length()) + second.substring(1,second.length()));




    }


}
/*
1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov


	2. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex


	3. Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea


	4. ask the user to enter a word. if the word ends with "ly", print "really???" ,
	 otherwise, print "never mind"



Medium Spicy:
	5. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

	6. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight



Very Spicy:
	7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

    8. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com


    9. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */