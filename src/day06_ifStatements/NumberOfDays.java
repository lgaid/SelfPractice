package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

       int n = 1;
       boolean has28d = n ==2;
       boolean has30d = n ==4 || n == 6 || n == 9 || n == 11;
       boolean has31d = !has28d && !has30d; // if  month doesn't have 28 nor 30 days

    String result = "";

    if (has28d){
        result = "28";
    }
    if (has30d){
        result = "30";
    }
    if (has31d){
        result = "31";
    }

        System.out.println(result);

    }


}
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */