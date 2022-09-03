package day07_IfStatements;

public class Grade {


    public static void main(String[] args) {


        int score = 95;

        String result = "Your grade is: ";
        if (score <= 100 && score >= 0) {
            if (score >= 90) { // false: score <90
                result += "A";
            } else if (score >= 80) { // false: score <80
                result += "B";
            } else if (score >= 70) { // false: score <70
                result += "C";
            } else if (score >= 60) { // false: score <60
                result += "D";
            } else {
                result += "F";
            }
        } else {
            result += "Invalid";
        }
        System.out.println(result);

    }


}


/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */