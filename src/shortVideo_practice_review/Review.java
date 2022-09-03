package shortVideo_practice_review;

public class Review {

    public static void main(String[] args) {


// BOOLEAN

    /*
        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 52;

        System.out.println(result3);

        System.out.println("---------------------------------");

        int a = 100;
        int b = 200;

        boolean aIsGreaterThan_b = a > b;

        System.out.println(aIsGreaterThan_b);


 */

// CASTING

      /*
     int a = 100; // smaller to bigger datatype (Implicit) automatically done
        double b = a;

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------");

        double c = 6.0; // bigger to smaller (explicit)datatype must be done manually
        int d = (int)c;

        System.out.println(c);
        System.out.println(d);

        System.out.println("------------------------------");


         */

// ARITHMETIC operators

    /*
        System.out.println(10d/6); // all arithmetic ops can be done in the print statements (add d to one of the
                                    // to get the exact result or add .0 to either number

        System.out.println(10 % 4); // calculates only the remainder  NOT total sum

 */

// UNARY ops

        /*

        int a = -100;
        int b = 200;


        boolean aIsLessThan0 = a < 0;
        boolean bIsGreaterThan0 = b > 0;

        System.out.println(aIsLessThan0);

        int a = 100;

         */


// SHORTHAND ops

    /*

        int b = 200;

        b += 100; // now b = 300
        System.out.println(b);
        // so all arithmetic ops assigns the new value to the variable

 */

// RELATIONAL OPS  //  All RELATIONAL OPS RETURN BOOLEAN (TRUE OR FALSE)

      /*


        boolean result1 = 100 >= 200;
        System.out.println(result1);


         */

// LOGICAL  OPS // ALL LOGICAL OPS RETURN BOOLEAN

    /*
        boolean result1 = 100 == 200 || 100 >= 200;  // or || operator
        boolean result2 = 300 > 45 && 52 == 25;     // and && operator
        boolean result3 = 200 != 452;               // is not ! operator

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);


 */


// SINGLE IF, if & else, multiple branch if, nested if, else-if, ternary, switch
    /*
        int score = 75;

        if (score >= 60) {
            System.out.println("passed");
        }

        int result1 = 125;
        int result2 = 50;

        // Single IF

        if (result1 == 10) {

            System.out.println("Good");
        }

        System.out.println("-----------------------------------------");

            // IF & ELSE

        if (result1 == 5){
            System.out.println("Equal");
        }else{
            System.out.println("Invalid");
        }

        System.out.println("---------------------------------------------------");

        // MULTIBRANCH IF (CREATED WITH (ELSE-IF CLAUS)

        if (result1 > 25){
            System.out.println("Yes");

        } else if (result1 < 60) {
            System.out.println("No");

        } else if (result1 == 85) {
            System.out.println("Amount exceeded");

        } else if (result1 != 100) {
            System.out.println("Pre- author");

        } else if (result1 == 200) {
            System.out.println("completed");

        }else{
            System.out.println("Invalid results");
        }


        System.out.println("------------------------------------------------");


        //NESTED IF

        if (result2 == result1){
            System.out.println("incomplete");

            if (result2 >= 52){
                System.out.println("ok");

            } else if (result2 != 150) {
                System.out.println("terminate");

            } else if (result2 < 10) {
                System.out.println(" try again");

            } else if (result2 > 50) {
                System.out.println(" borderline");

            }else{
                System.out.println("please make an appointment");
            }


        }

        // TERNARY


       String result = (result1 != result2) ? "Yes" : (result1 == result2) ? "No" : (result1 > result2) ? "Maybe" : "how";

        System.out.println(result);

        System.out.println("----------------------------------------");

        // SWITCH

        int number = 1;

        switch (number){

            case 1:
                System.out.println("make an appointment");
                break;
            case 2 :
                System.out.println("Delete results");
                break;
            case 3 :
                System.out.println("cancel");
                break;

            case 4 :
                System.out.println("Add");
                break;

            case 5 :
                System.out.println("Subtract");
                break;

        }

 */


// SCANNER CLASS
/*
       // import java.util.Scanner;
       // Scanner input = new Scanner(System.in);

 */



// STRING CLASS

/*
        String name = "wooden spoon"; // immutable
       name = name.toUpperCase();   // to change from being immutable, reassign the variable name = name.toUpperCase();

        System.out.println(name);

        System.out.println("---------------------------------------------------");


    // INDEX NUMBER -- Index numbers start from  0 ~


        // charAt index
        String str = "Cydeo";
        char ch1 = str.charAt(2); // if you want to reuse it

        System.out.println(str.charAt(2));

        System.out.println("----------------------------------------");


        // length
        String str2 = "Wooden spoon";
        int n1 = str2.length();

        System.out.println(n1);

        // lastIndex

        int lastIndex = str2.length() -1;

        System.out.println("lastIndex = " + lastIndex);

        // If you want to print all of word or string WITHOUT last character:
 System.out.println(dataname.substring(1,first.length())); // example
  Syntax: variableName.substring(index number, variableName.length()-1)

 */


// LOOPS

 /*       // for loop and while loop are interchangeable

        for (int i = 1; i <= 10; i++){ // i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            System.out.println("Hello World"); // 1
        }

        while(true){
            System.out.println("Hello Cydeo");
        }


 */












    }


}
