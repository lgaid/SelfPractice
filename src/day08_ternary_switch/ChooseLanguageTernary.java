package day08_ternary_switch;

public class ChooseLanguageTernary {


    public static void main(String[] args) {

        int selection = 3;

        String result = (selection ==1) ? "Hello, thank for your call" :(selection ==2) ? "Hola, gracias para llamar" :
                        (selection ==3) ? "Merhaba, aradiginiz icin tesekkurler" :(selection ==4) ? "Privet, spasibo za vash zvonok"
                        :(selection ==5) ? " Merci ,pour votre appel" : "Invalid number";

        System.out.println(result);


    }


}
/*
 Create a class called ChooseLanguageSwitch,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given
 		in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */