package day19_arraysIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

       int zeroCount = Collections.frequency(numList,0);

       numList.removeAll(Arrays.asList(0));
        for (int i = 0; i < zeroCount; i++) {

            numList.add(0);

        }
        System.out.println(numList);

    }


}
/*
6. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */