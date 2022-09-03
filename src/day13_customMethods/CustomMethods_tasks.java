package day13_customMethods;


public class CustomMethods_tasks {

    public static void main(String[] args) {


    }

    public static boolean isOdd(int num) {

        boolean isOdd;
        return isOdd = (num % 2 != 0);

    }

    public static boolean isEven(int num) {
        boolean isEven;
        return isEven = (num % 2 == 0);

    }

    public static int max(int n1, int n2) {

        if (n1 > n2) {

        } else {
            return n2;
        }

        return n1;
    }

    public static void min(int n1, int n2) {
        if (n1 < n2) {

        } else {
            return;
        }

    }

}

/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers
 */


