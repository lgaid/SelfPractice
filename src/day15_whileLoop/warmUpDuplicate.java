package day15_whileLoop;

public class warmUpDuplicate {


    public static void main(String[] args) {

        String str = "aabbcccc";

        String result = ""; // to hold the "abc" result

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (  !result.contains( "" + each)){
                result += each;
            }


        }

        System.out.println(result);





    }


}
