package day10_string;

public class salary {


    public static void main(String[] args) {

        salary(45,40);

    }

    public static void salary(int weeklyHours, double hourlyRate) {

        double totalSalary = hourlyRate * weeklyHours * 52;



        System.out.println("You make  $" + hourlyRate + " per hour " + "\n" +
                "You work " + weeklyHours + " hours per week" + "\n" +
                "Your gross income is $" + totalSalary);



    }



}
/*
output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0

 7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)



 */