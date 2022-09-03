package day15_whileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int divide = 0;

        System.out.println("Please enter the first number");
        int num1 = input.nextInt();

        System.out.println("Please enter the second number");
        int num2 = input.nextInt();

        while (num1 >= num2){
            num1 -= num2;
            divide++;

        }

        System.out.println(divide);

    }



}





/*
4.  Create a class named DivideTwoNumbers and Write a program that can
divide two positive numbers without using / (division) and * (multiplication) operators.

 */