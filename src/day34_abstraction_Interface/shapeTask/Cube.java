package day34_abstraction_Interface.shapeTask;

public class Cube extends Shape implements Volume{

    public double radius;
    public double side;



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }



    @Override
    public double volume() {
        return side * side * side;
    }


}
