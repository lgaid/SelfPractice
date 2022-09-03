package day34_abstraction_Interface.shapeTask;

public class Square extends Shape {


    public double side;



    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }


}
