package day34_abstraction_Interface.shapeTask;

public  class Circle extends Shape {

    public double radius;
    public  static double pi = 3.14;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }


}


