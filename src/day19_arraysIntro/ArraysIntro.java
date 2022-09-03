package day19_arraysIntro;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that can store 5 integers

        int [] numbers = new int[5];    // [0,0,0,0,0]

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        //numbers[5] = 60;  // will print out of bounds because once the array it is fixed can't change


        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);



        // Create a variable named colors that has: Yellow, Red, White, Blue,Green, Black

        String [] colors = {"Yellow", "Red", "White", "Blue","Green", "Black"};

        System.out.println(Arrays.toString(colors));
        System.out.println(colors.length);


    }


}
