package day06_ifStatements;

public class IdentifyNumber {


    public static void main(String[] args) {

        int num = 200;

        boolean ispositive = true;
        boolean isNegative = false;
        boolean isZero = false;

        System.out.println( num  + " is positive number: " + ispositive + "\n" + num
                + " is negative number: " + isNegative + "\n" + num + " is zero: " + isZero);

    }




}



/*
Create a class named IdentifyNumber, and write a program that can identify
if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */