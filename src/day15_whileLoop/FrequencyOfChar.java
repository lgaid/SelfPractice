package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "";
        char letter = 'e';
        String result = "";

        System.out.println("Please enter a phrase or sentence.");
        String str1 = input.next();

        System.out.println("Please enter a character you want to count");
        input.next();

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(0);

            if (  result.contains("" + each )){
                result += each;
            }
        }

        System.out.println(result);

    }


}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to
entera string and a char, then returns the frequency
of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */