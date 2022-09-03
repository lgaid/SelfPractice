package day08_ternary_switch;

public class BiggerNum {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 35;
        int n3 = 15;



        String biggestNumber = (n1 > n2 && n1 > n3) ? "77 is bigger"
                                :(n2 > n1 && n2 > n3) ? "35 is bigger" : "15 is bigger";

        System.out.println(biggestNumber);

    }




}


/*
Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */