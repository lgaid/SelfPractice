package day34_abstraction_Interface.shapeTask;

import static day34_abstraction_Interface.shapeTask.Circle.pi;

public class Cylinder extends Shape implements Volume {

public double height;
public double radius;




    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * pi * radius * height + (2* pi * radius * radius);
    }
    @Override
    public double volume() {
        return pi * radius * radius * height ;
    }



}
