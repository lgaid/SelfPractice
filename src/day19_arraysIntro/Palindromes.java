package day19_arraysIntro;

public class Palindromes {

    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};

        String reverse = "";
        int count = 0;

        for (String each : arr) {

            for (int i = each.length() - 1; i >= 0; i--) {

                reverse += each.charAt(i);

                if (each.equalsIgnoreCase(reverse)) {
                    count++;
                }
            }
            reverse = "";
        }
        System.out.println(count);


    }


}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */