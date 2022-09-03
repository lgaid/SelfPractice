package day07_IfStatements;

public class CappuccinoBuyer {

    public static void main(String[] args) {


        String size = "tall",
              size1 = "grande",
              size2 = "venti";

        String result = "";

        if (size == "tall" || size == "grande" || size == "venti") {

            if (size == "tall") {
                result = "tall: " + "\n" + "\t price is $3.69" + "\n" + "\t 90 calories";

            } else if (size == "grande") {
                 result = "grande" + "\n" + "\t price is $3.99" + "\n" + "\t 120 calories";

            } else{
                result = "price is $4.29" + "\n" + "\t 150 calories";
            }
                    }else{
                        System.out.println("Invalid Size");

            }
                System.out.println(result);

        }




    }


/* Create a class called  CappuccinoBuyer. A variable named Size is given,
write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if
 */

