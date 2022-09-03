package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Please enter your first number");
        int num1 = input.nextInt();

        while (num1 >= 0){
            System.out.println(" Please enter your second number");
         sum += num1;
         num1 = input.nextInt();

        }
        System.out.println(sum);
    }


}
/*
5. Create a class named UntilNegative and Write a program that calculates the
 sum of numbers entered by the user until user enters a negative number.
 */