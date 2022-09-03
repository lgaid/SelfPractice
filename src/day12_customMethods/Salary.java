package day12_customMethods;

public class Salary {


    public static void main(String[] args ) {


    }

    public static void salary(double hourlyRate, int weeklyHours){

        System.out.println("You make $" + hourlyRate + "per hour" + "\n" + "You work " + weeklyHours +
                " in a week" + "\n" + "Your gross income is" + weeklyHours * hourlyRate * 52);

    }



}


/*
7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */