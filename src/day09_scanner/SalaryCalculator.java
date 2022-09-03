package day09_scanner;

import java.util.Scanner;


public class SalaryCalculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("What is your hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work weekly?");
        int hours = input.nextInt();

        System.out.println("What is your state tax percentage rate?");
        double stateTaxRate = input.nextDouble();

        System.out.println("What is your federal tax percentage rate?");
        double fedTaxRate = input.nextDouble();


        double totalSalary = hourlyRate * hours * 52;
        double sateTax = totalSalary * stateTaxRate /100;
        double federalTax = stateTaxRate * fedTaxRate/100;
        double totalTax = stateTaxRate + federalTax;
        double netIncome = totalSalary - totalTax;


        System.out.println("totalSalary = " + totalSalary);
        System.out.println("sateTax = " + sateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);



    }



}


/*
Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */