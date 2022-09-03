package day12_customMethods;

public class eligibleToVote {


    public static void main(String[] args) {

    }

    public static void eligibleToVote(int age, boolean isCitizen) {

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to vote");

        } else {
            System.out.println("Sorry you are not eligible to vote");
        }

    }
}


/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

 */