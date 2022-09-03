package day06_ifStatements;

public class CharacterIdentity {

    public static void main(String[] args) {

        char character = 'a';

        String type = "";

        if (character >= 32 && character <= 47 || character >= 58 && character <= 64 || character >= 123 && character <= 127) {
            type = "Special Character";
        } ;
        if (character >= 48 && character <= 57) {
            type = "digit";
        }

        if (character >= 65 && character <= 90) {
            type = "Upper Case Alphabet";
        }

        if (character >= 97 && character <= 122) {
            type = "lower case alphabet";
        }

        System.out.println("type = " + type);


    }


}
/*
Create a class named CharacterIdentity, and write a program that can identify
if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the characters on ASCII table
 */