package day10_string;

public class eligibleToVote {


    public static void main(String[] args) {

        int age = 5;
        boolean isAmerican = true;
       eligibleToVote(35,true);

    }

    public static void eligibleToVote(int age, boolean isAmerican ) {


        String result = "";

        if (age >= 18 && isAmerican){
            System.out.println(" You are eligible to vote");

        }else{
            System.out.println("You are not eligible to vote ");
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