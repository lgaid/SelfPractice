package day19_arraysIntro;

public class CountEvenAndOdd {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int evenCount = 0;
        int oddCount = 0;

        for (int each : array) {

            if (each % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("oddCount = " + oddCount);
        System.out.println("evenCount = " + evenCount);


    }

}
/*
2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */