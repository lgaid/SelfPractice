package shortVideo_practice_review;

public class CommonElements1 {


    public static void main(String[] args) {

       int [] arr1=  {1,2,3,4,5};
       int[] arr2 = {4,5,6,7,8};
        String common = "";

        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1 == each2 && !(common.contains(each1 +""))){
                    common += each1 + " " + " \n";

                }

            }

        }
        System.out.println(common);


    }


}

/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */
