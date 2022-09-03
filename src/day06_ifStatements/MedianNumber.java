package day06_ifStatements;

public class MedianNumber {


    public static void main(String[] args) {


        int a=10;
        int b=20;
        int c=15;
        String result="";

        if(b>a&&b<c)
        {result= b+" is the median number.";}
        if(a>b&&a<c)
        {result=a+" is the median number.";}
        if(c>a&&c<b)
        {result=c+" is the median number.";}

        System.out.println("result = " + result);




    }



}

/*
Create a class named MedianNumber.
write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
