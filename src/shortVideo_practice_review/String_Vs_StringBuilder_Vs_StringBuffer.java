package shortVideo_practice_review;

public class String_Vs_StringBuilder_Vs_StringBuffer {


    public static void main(String[] args) {

    String string = "Wooden"; // immutable
    string.concat(" Spoon"); // " Wooden Spoon"

        System.out.println(string);

        System.out.println("--------------------------------------------------------");


        StringBuilder stringBuilder = new StringBuilder("Wooden"); // un-synchronized: mutable
        stringBuilder.append(" Spoon");

        System.out.println(stringBuilder);


        System.out.println("-----------------------------------------------------------------");


        StringBuffer stringBuffer = new StringBuffer("Wooden");  // synchronized: mutable
        stringBuffer.append(" Spoon");

        System.out.println(stringBuffer);






    }



}
