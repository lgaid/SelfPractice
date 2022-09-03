package day04_concatenation;

public class CarInfo {


    public static void main(String[] args) {

        int year = 2010;
        String make = "BMW",
                model = "X5";
        int miles = 35000;
        String color = "Black";
        int price = 8000;

        System.out.println("Car information is:\n\t" + year + " " + make + " " + model + ", "
                + miles + " " + "miles" + "," + color + "," + " " + "$" + price + "." ) ;


    }




}



















/*
Create a class named CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
 */