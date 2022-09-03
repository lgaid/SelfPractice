package day28_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {


        ArrayList<Candy> candyList = new ArrayList<>();
        Candy[] arr = {new Candy("M & M", 2, 4, true),
                new Candy("M & M", 2, 4, true),
                new Candy("Snickers", 2, 2, true),
                new Candy("Mars", 3, 4, false),
                new Candy("Kinder", 4, 2, false) };
        candyList.addAll(Arrays.asList(arr));

        for (Candy candy : candyList) {
            System.out.println("Brand: " + candy.getBrand() + "price: " + candy.getPrice());
        }

        System.out.println(candyList);
    }


    }
/*
   5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */