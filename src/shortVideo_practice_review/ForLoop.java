package shortVideo_practice_review;

public class ForLoop {

    public static void main(String[] args) {

       String word = "Hello World";

        for (int i = 1; i <= 10; i++){ // i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            System.out.println("Hello World"); // 1
        }

        System.out.println("-------------------------------------------------");



        String str = "Java";
        //            0123

        //"avaJ"

        String reverse = ""; // "avaJ"

        for (int i = str.length() - 1; i >=0; i--){
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
        




    }

    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);

        }

        return reverse;

    }

}
