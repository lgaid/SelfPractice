package lab07_classAndObject;

public class TestCarObjects {

    public static void main(String[] args) {


        Car car1 = new Car();
        car1.brand = "BMW";
        car1.year = 2022;
        car1.model = "X6";
        car1.color = "Red";
        car1.price = 50000;

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "Q4";
        car2.color = "Black";
        car2.year = 2021;
        car2.price= 45000;


        System.out.println(car1);
        System.out.println(car2);




    }


}
