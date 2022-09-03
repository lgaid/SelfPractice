package groupPractice.groupTaskAbstract;

public class CircleHouse extends Properties{
    private double Radius;
    private final double PI = 3.14;

    public CircleHouse(double radius) {
        setRadius(radius);
    }


    public double getRadius() {
        return Radius;
    }
    public void setRadius(double radius) {
        if(radius<0){
            throw new RuntimeException("radius has to be a positive number: " + radius);
        }
        Radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double area() {
        return PI*(Radius*Radius);
    }


    @Override
    public String toString() {
        return "CircleHouse{" +
                "Radius=" + Radius +
                '}';
    }


}
