package day08_ternary_switch;

public class CydeoBatches {


    public static void main(String[] args) {

        String batchType = "EU";

        switch (batchType){

            case "EU":
            System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
            break;

            case "UsEvening":
                System.out.println("\"Class times are 7-10 EST. M, T, W, Th, S, S\"");
                break;

            case "UsMorning":
                System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                break;

            default:
                System.out.println("Invalid batch");


        }

        

    }

}
/*
 Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 3: use if & switch statements mixed

 */