package day10_string;

public class MonthName {

    public static void main(String[] args) {

        int monthNum = 14;
        monthName(monthNum);

    }

    public static void monthName(int monthNum){

        String result ="";

        if (monthNum == 1){
            System.out.println("January");

        } else if (monthNum == 2) {
            System.out.println("February");

        } else if (monthNum == 3) {
            System.out.println("March");

        } else if (monthNum == 4) {
            System.out.println("April");

        } else if (monthNum == 5) {
            System.out.println("May");

        } else if (monthNum == 6) {
            System.out.println("June");

        } else if (monthNum == 7) {
            System.out.println("July");

        } else if (monthNum == 8) {
            System.out.println("August");

        } else if (monthNum == 9) {
            System.out.println("September");

        } else if (monthNum == 10) {
            System.out.println("October");

        } else if (monthNum == 11) {
            System.out.println("November");

        } else if (monthNum == 12) {
            System.out.println("December");

        }else{
            System.err.println("Invalid number");
        }

    }



}
/*
3. Create a method named monthName that can display the name of the month based
on the given number to the method, if the number is invalid, then the method should
print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */