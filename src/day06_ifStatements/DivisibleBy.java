package day06_ifStatements;

import java.util.Scanner;

public class DivisibleBy {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");

        int number = scanner.nextInt();

        if ((number % 3 == 0) && (number % 5 == 0)){
            System.out.println("Divisible by 3 and 5");
        }else if (number % 3 == 0){
            System.out.println("Divisible by 3");
        }else if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Non-Divisible");
        }



    }



}
