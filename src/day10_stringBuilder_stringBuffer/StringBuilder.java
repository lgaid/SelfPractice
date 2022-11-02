package day10_stringBuilder_stringBuffer;

public class StringBuilder {

    public static void main(String[] args) {

        String string = "Wooden";
        string.concat("Spoon");

        System.out.println(string);

        System.out.println("-----------------------------------------------------");

//        StringBuilder stringBuilder = new StringBuilder("Wooden");
//        stringBuilder.append(" Spoon");

  //      System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Wooden");
        stringBuffer.append(" Spoon");

        System.out.println(stringBuffer);


    }




}



