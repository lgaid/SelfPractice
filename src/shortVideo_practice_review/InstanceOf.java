package shortVideo_practice_review;

import day34_abstraction_Interface.shapeTask.*;

public class InstanceOf {


    public static void main(String[] args) {


        Shape shape1 = new Circle();


        Shape shape2 = new Square();


        Shape shape3 = new Rectangle();


        Shape shape4 =new Cube();


        Shape shape5 = new Cylinder();





        if (shape1 instanceof Square) {
            System.out.println("It is a square");
        }else{
            System.out.println(" it is not a square");
        }

        System.out.println("------------------------------");

        if (shape3 instanceof Rectangle) {
            System.out.println("It is a rectangle");
        }else{
            System.out.println(" it is not a rectangle");
        }




    }




}
