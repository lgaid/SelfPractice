package day15_whileLoop;

import java.util.Scanner;

public class Multiplying {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Please enter a number");
        int num1 = input.nextInt();

        System.out.println("Please enter a number");
        int num2 = input.nextInt();

        for (int i = 0; i < num2; i++) {
            sum += num1;

        }
        System.out.println(sum);

    }


}

/*
5. Create a class named UntilNegative and Write a program that calculates the
 sum of numbers entered by the user until user enters a negative number.
 */