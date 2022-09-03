package lab05_string;

public class RemoveDuplicates {


    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            //result.indexOf(each) < 0
            if(!result.contains(""+each)) { // before adding the character to the new string, we check if the character is not included.
                result += each;
            }

        }


        System.out.println(result);



    }


}
