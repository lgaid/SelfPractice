package shortVideo_practice_review;


import day34_abstraction_Interface.shapeTask.*;

public class Polymorphism {


    public static void main(String[] args) {

       Shape shape1 = new Circle();
        System.out.println(shape1.area());

       Shape shape2 = new Square();
        System.out.println(shape2.area());

       Shape shape3 = new Rectangle();
        System.out.println(shape3.area());

       Shape shape4 =new Cube();
        System.out.println(shape4.area());

       Shape shape5 = new Cylinder();
        System.out.println(shape5.area());


        System.out.println("-------------------------------------");

        Circle circle1= new Circle();
        circle1.radius = 30;
        System.out.println(circle1.area());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 3.5;
        rectangle1.width = 2.5;
        System.out.println(rectangle1.area());

        Square square1 = new Square();
        square1.side = 20.5;
        System.out.println(square1.area());

       Shape[]Shape = {circle1,rectangle1,square1,shape1,shape2,shape3};



        Volume obj1 = new Cube();

        System.out.println(obj1.volume());

        Volume obj2 = new Cylinder();



    }



}
