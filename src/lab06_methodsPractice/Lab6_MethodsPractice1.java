package lab06_methodsPractice;

public class Lab6_MethodsPractice1 {

    public static void main(String[] args) {

        helloName("James");
        System.out.println(helloName("James"));

        System.out.println("-----------------------------------");


        System.out.println(makeAbba("Hi","Bye"));


        System.out.println("----------------------------------------");


        System.out.println(firstTwo("Hello"));


        System.out.println("----------------------------------------------");


        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("School"));

        System.out.println("---------------------------------------------------");


        System.out.println(comboString("Hello","Hi"));

        System.out.println("------------------------------------------------------");

        System.out.println(left2("Java"));



    }

    public static String helloName(String name){
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b){
        String result = a + b + b + a;


        return result;

    }

    public static String extendEnd(String str){
        if(str.length() < 2 ){
            return str;

        }

        String substring = str.substring(str.length() -2);
        String result = str.repeat(3);
        return result;

    }

    public static String firstTwo(String str){
       /*
        if(str.length() < 2){
            return str;
        }

        return "" + str.charAt(0) + str.charAt(1);


        */

        if(str.length() >= 2){
            return str.substring(0,2);

        }else{
            return str;
        }


    }

    public static String withoutEnd(String str){
        if(str.length() >= 3){
            return str.substring(1,str.length()-1);
        }else{
            return str;
        }

    }


    public static String comboString(String a, String b){

        if(a.length() > b.length()){
            return b + a + b;

        } else if (b.length() > a.length()) {
            return a + b + a;

        }else{
            return a + b;
        }

    }

                        // "Hello"
    public static String left2(String str){

        if(str.length() < 3){
            return str;

        }

        String s1 = str.substring(0, 2);  // "He"
        String s2 = str.substring(2);  // "llo"

        return s2 + s1; // lloHe
    }






}
