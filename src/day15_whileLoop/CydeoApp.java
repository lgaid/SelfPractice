package day15_whileLoop;

import java.util.Scanner;

public class CydeoApp {


    public static void main(String[] args) {

        String username = "Cydeo";
        String password = "Cydeo123";

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Cydeo! ");


            for (int i = 3; i > 0;) {

                System.out.println("Please enter your username");
                String givenUsername = input.next();

                if (!username.equals(givenUsername)){
                        System.out.println("Invalid user name. Please try again");
                        i --;
                        continue;
                    }

                    System.out.println("Please enter your password");
                    String givenPassword = input.next();

            if (password.equals(givenPassword)) {
                System.out.println("Logged in");
                break;

            } else {

                if (i != 1){

                    System.out.println("Invalid credentials!  left" + (i-1) + "chances to try" );

                    i--;


                }else{

                    System.out.println("Your account is locked. Please try again again later.");
                    System.exit(0);
                }
            }




        }

    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is lucked."


 */