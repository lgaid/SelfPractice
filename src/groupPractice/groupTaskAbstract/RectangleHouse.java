package groupPractice.groupTaskAbstract;

import java.util.logging.Level;

public class RectangleHouse extends Properties{
    private double length;
    private double width;

    public RectangleHouse(double length, double width) {
        this.length= length;
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            throw new RuntimeException("length has to be a positive number: " + length);
        }
        length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            throw new RuntimeException("width has to be a positive number: " + width);
        }
        width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "RectangleHouse{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}