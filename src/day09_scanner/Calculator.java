package day09_scanner;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the first number");
        double num1 = input.nextDouble();

        System.out.println("Enter math operator");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        String result = "";


        switch (operator) {
            case '+':
                result += num1 + num2;
                break;

            case '-':
                result += num1 - num2;
                break;

            case '*':
                result += num1 * num2;
                break;

            case '/':
                result += num1 * num2;
                break;

            default:
                result = "Invalid operator";
                break;



        }

            System.out.println(result);

        input.close();

    }



}


/*
Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
 */