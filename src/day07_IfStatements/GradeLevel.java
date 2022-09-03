package day07_IfStatements;

public class GradeLevel {


    public static void main(String[] args) {

        int gradeLevel = 9;

        if(gradeLevel>=1 && gradeLevel<=18){

            if (gradeLevel <= 5) {
                System.out.println("Elementary School");
            }else if (gradeLevel<=8){
                System.out.println("Middle School");
            }else if (gradeLevel<=12){
                System.out.println("High School");
            }else if (gradeLevel<=16){
                System.out.println("College");
            }else{
                System.out.println("Grad School");
            }

        }else{
            System.out.println("Invalid");
        }



    }


}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */