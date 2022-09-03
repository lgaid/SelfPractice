package day19_arraysIntro;

public class UniqueElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5};
        String unique = "";

        for (int each1 : arr) {

            int count = 0;
            for (int each : arr) {

                if (each1 == each) {
                    count++;
                }
            }
            if (count == 1 && !(unique.contains(each1 + ""))) {
                unique += each1 + " ";
            }
        }
        System.out.println(unique);


    }


}

/*
5. Write a program that can display the unique elements of an array

			MUST use for each loops
 */
