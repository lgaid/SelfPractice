package day12_customMethods;

public class Day {

    public static void main(String[] args) {
        day(3);

    }

    public static void day(int num) {
        if (num >= 1 && num <= 7) {
            String day = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";
            System.out.println(day);
        } else {
            System.out.println("Invalid Number");
        }
    }


}


/*
4. Create a method named day that can display the name of the day based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */