package groupPractice.groupTaskAbstract;

public class SquareHouse extends Properties{
    private double side;

    public SquareHouse(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            throw new RuntimeException("radius has to be a positive number: " + side);
        }
       side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String toString() {
        return "SquareHouse{" +
                "side=" + side +
                '}';
    }
}