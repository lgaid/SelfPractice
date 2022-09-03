package day19_arraysIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> combine = new ArrayList<>(Arrays.asList(arr1));
        combine.addAll(Arrays.asList(arr2));

        System.out.println(combine);


    }

}
/*
2. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */