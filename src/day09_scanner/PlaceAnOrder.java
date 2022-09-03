package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the name of the product you would like to order");
        String product = input.nextLine();

        System.out.println("Please enter the price");
        double price = input.nextDouble();

        System.out.println("Please enter the quantity");
        int quantity = input.nextInt();



        System.out.println("Please enter your first name");
        String firstName = input.next();

        System.out.println("Your total is " + quantity * price);
        double totalCost = price * quantity;



        System.out.println(firstName + " Your order for " +
               quantity + " " + product + " has been placed. " + " Your total is " + totalCost );

        input.close();



    }


}


/*
Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */