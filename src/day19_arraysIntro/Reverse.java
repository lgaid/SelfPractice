package day19_arraysIntro;

public class Reverse {


    public static void main(String[] args) {

        String sentence = "I Love Java";


        String[] arr = sentence.split(" ");

        String reverse = "";

        for (int i = arr[1].length() - 1; i >= 0; i--) {
            reverse += arr[1].charAt(i);
        }

        arr[1] = reverse;

        String newSentence = "";

        for (String each : arr) {
            newSentence += each + " ";
        }
        System.out.println(newSentence);


    }

}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java



 */