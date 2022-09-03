package shortVideo_practice_review;


import day34_abstraction_Interface.shapeTask.Cube;
import day34_abstraction_Interface.shapeTask.Shape;

public class ReferenceTypeCasting {


     public static void main(String[] args) {

         //----------------------up casting--------------------------------------

         Shape shape1 = new Cube();




         //----------------------down casting------------------------------------

         Shape shape2 = new Cube();

         System.out.println(shape2.area());
         System.out.println( ((Cube)shape2 ).volume() );




     }


}
