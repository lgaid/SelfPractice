package day10_string;

public class Day {


    public static void main(String[] args) {

        int num = 12;
        day(num);

    }

    public static void day(int num) {

        String result = "";

        result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday"
                : (num == 4) ? "Thursday" : (num == 5) ? "Friday" : (num == 6) ? "" + "Saturday"
                :(num == 7)? "Sunday" : "Invalid number";

        System.out.println(result);

    }


}
/*
4. Create a method named day that can display the name of the day based on the given number
to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */