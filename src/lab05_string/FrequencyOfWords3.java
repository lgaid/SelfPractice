package lab05_string;

public class FrequencyOfWords3 {


    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;

        for(int i = 0; i <= sentence.length()-4; i++){
            String each = sentence.substring(i, i+4);

            if(each.equals("Java")){
                countJava++;
            }

        }


        System.out.println(countJava);




    }



}
