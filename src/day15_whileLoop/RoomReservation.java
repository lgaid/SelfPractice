package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String rooms = "";
        String result ="";

        System.out.println("Would you like to reserve a room? Yes/No");
        String yesOrNo = input.next();

        if (yesOrNo == "yes") {
            System.out.println("Which room would you like to reserve");
            String roomSelection = input.next();
        }

        switch (result){
            case "KingBed":
                System.out.println("Room with King bed at $120");
                break;

            case "Queen Bed":
                System.out.println("Room with a Queen Bed at $100");
                break;

            case "Single Bed":
                System.out.println("Room with Single Bed at $80");
                break;

            default:
                System.out.println("Invalid room selection.  Please enter your selection again");
        }

        if (yesOrNo == "no") {
            System.out.println("Have nice a day");
            return;

        }else{
            System.out.println("Invalid answer! Please re-enter answer");

        }

        System.out.println(result);


    }


}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */