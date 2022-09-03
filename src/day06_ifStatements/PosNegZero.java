package day06_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int num1 = -65;
        String result = "";

        if ( num1 > 0) {
            result = "Positive";
        }
        else if ( num1 == 0 ) {
            result = "Zero";
        }
        else {
            result = "Negative";
        }
        System.out.println(result);

    }
}

/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 65
output:
Positive
 */
