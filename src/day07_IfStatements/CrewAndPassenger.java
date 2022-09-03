package day07_IfStatements;

public class CrewAndPassenger {


    public static void main(String[] args) {

        int numberOfPeople = 30;

        String result = "";

        if (numberOfPeople >= 1 && numberOfPeople <= 30
                || numberOfPeople >= 31 && numberOfPeople <= 50
                || numberOfPeople >= 51 && numberOfPeople >= 70){

            if (numberOfPeople <= 30){
                System.out.println("Total: 50 ====> 20 crew, 30 passengers");

            } else if (numberOfPeople <= 50) {
                System.out.println("Total: 75 ====> 25 crew, 50 passengers");

            } else if (numberOfPeople <= 70) {
                System.out.println("Total: 100 ====> 30 crew, 70 passengers");

            }else {
                System.out.println("Any other number of people on the ship is not valid");
            }

        }

        System.out.println(result);


    }


}

/*
Create a class called CrewAndPassenger, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */


