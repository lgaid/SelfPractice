package day10_string;

public class DaysInMonth {

    public static void main(String[] args) {

        String month = "January";
        daysInMonth(month);

    }

    public static void daysInMonth(String month) {

        String result = "";

       result = (month == "January")? "31 " :(month == "February")? "28" :(month == "March")? "31"
        :(month == "April")? "30" :(month == "May")? "31" : (month == "June")? "30" :(month == "July")? "31"
        : (month == "October")? "31" : (month == "November")? "30" : "31";

        System.out.println(month + " has " + result + " days");


    }


}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */