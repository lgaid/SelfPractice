package shortVideo_practice_review;

public class StringMethods {

    public static void main(String[] args) {


// String objects created by either String literal or by new keyword
        String str0 = "Hi";
        str0 = "Hello";

        System.out.println(str0);

 System.out.println("----------------------------------------------");


// charAt(int index) return type---> char
         String str = "Cydeo";

                //or this way: System.out.println(str.charAt(2)); // will print d
        char ch1 = str.charAt(2);
        System.out.println(ch1);

System.out.println("----------------------------------------------");


// length()return total length int

        String str2 = "Wooden Spoon";
        int n1 = str2.length();

        System.out.println(n1);

        int lastIndex = str2.length()-1;

        System.out.println(lastIndex);

System.out.println("-----------------------------------");


// trim() returns the String without all the unused white spaces return type---> String

        String str3 = "          Java Programming    Language   ";
        str3 = str3.trim();

        System.out.println(str3);


System.out.println("-----------------------------------------------------");


// indexOf() returns first matching character's index number return------> int

        String str4 = "Wooden Spoon";
        int indexNumOfFirst0 = str4.indexOf("o");

        System.out.println(indexNumOfFirst0);

System.out.println("-----------------------------------");

// replace( old value, new value); returns String

        String str5 = "Wooden Spoon";
        str5 = str5.replace("o","e"); // Weeden Speen


        String sentence1 = "I love Java";
        sentence1 = sentence1.replace("Java","C#");

System.out.println(sentence1);


// replaceFirst() replaces first matching character of String with given new character

        String str6 = "Wooden Spoon";
        str6 = str6.replaceFirst("o","e");

        System.out.println(str6);

 System.out.println("-------------------------------------------");

// subString(begIndex): creates substring from the beginning index to END of String return---> String
// subString(begIndex, endIndex):"  " beginning to end of given index return------> String

        String str7 = "Jav Programming Language";
        String result1 = str7.substring(3);
        String result2 = str7.substring(1,6);

        System.out.println(result1);
        System.out.println(result2);

System.out.println("-----------------------------------------------------");

// repeat(N): repeats the String (N = the number of times) return----> String

        String str8 = " Java is fun ";
        String r = str8.repeat(5);

        System.out.println(r);


 System.out.println("--------------------------------------------------");





    }


}
