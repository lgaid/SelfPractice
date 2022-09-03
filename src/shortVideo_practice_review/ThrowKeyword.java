package shortVideo_practice_review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {


    public static void main(String[] args) {


        System.out.println("Hello");

       // throw new ArithmeticException("Wrong Calc");

        //System.out.println("world");

        System.out.println("Enter age: ");
        int age= new Scanner(System.in).nextInt();

        if (age < 0 || age > 130) {
            throw new InputMismatchException("Invalid Age: " + age);
        }

        System.out.println(" age = " + age);

    }


}




