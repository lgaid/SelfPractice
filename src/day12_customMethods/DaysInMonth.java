package day12_customMethods;

public class DaysInMonth {

    public static void main(String[] args) {
        daysInMonth("december");

    }

    public static void daysInMonth(String month){
        month =month.toLowerCase();

        switch (month){

            case "april": case "june":case "september": case "november":
                System.out.println("Has 30 days");
                break;


            case "january" : case "march" : case "may" : case "july" : case "august" : case "october" : case "december":
                System.out.println("Has 31 days");
                break;


            case "february" :
                System.out.println("Has 28 days");
                break;

                default:
                System.out.println("Invalid month");



        }



    }

}


/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

 */