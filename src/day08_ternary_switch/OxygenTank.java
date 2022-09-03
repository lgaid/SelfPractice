package day08_ternary_switch;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 80;

        switch (level){

            case 50:
                System.out.println("Be careful now you are 50%");
                break;

            case 60:
                System.out.println("Start to head back");
                break;

            case 70:
                System.out.println("Don't go too far");
                break;

            case 80:
                System.out.println("Still okay");
                break;

            case 90:
                System.out.println("Your tank is full");
                break;



        }


    }


}


/*
Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
			Solution 2:	MUST use switch statement
 */