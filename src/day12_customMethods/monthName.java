package day12_customMethods;

public class monthName {


    public static void monthName(int num) {

        String dayMonth = (num > 0 && num <= 12) ?

                (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" :
                        (num == 4) ? "April" : (num == 5) ? "May" : (num == 6) ? "June" :
                                (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September" :
                                        (num == 10) ? "October" : (num == 11) ? "November" : "December"
                                                : "Invalid Number";

        System.out.println(dayMonth);
    }



}





/*

3. Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June

 */