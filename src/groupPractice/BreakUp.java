package groupPractice;

public class BreakUp {



    public static String splitCamel(String str){

        String result = "";


        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            result = Character.isUpperCase(ch)? result + " " + ch : result + ch;
        }
        return result;
    }





}
/*
❖ Write a function that will break up camel casing, using a space
between words
 */