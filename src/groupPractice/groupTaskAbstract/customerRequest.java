package groupPractice.groupTaskAbstract;

import java.util.ArrayList;

public class customerRequest {
    public static void main(String[] args) {
        ArrayList<Properties> properties = new ArrayList<>();
        RectangleHouse rectangleHouse1 = new RectangleHouse(20, 30);
        RectangleHouse rectangleHouse2 = new RectangleHouse(20, 25);

        SquareHouse squareHouse1 = new SquareHouse(20);
        SquareHouse squareHouse2 = new SquareHouse(25);
        SquareHouse squareHouse3 = new SquareHouse(30);

        CircleHouse circleHouse1 = new CircleHouse(10);
        CircleHouse circleHouse2 = new CircleHouse(20);
        CircleHouse circleHouse3 = new CircleHouse(15);

        properties.add(rectangleHouse1);
        properties.add(rectangleHouse2);
        properties.add(squareHouse1);
        properties.add(squareHouse2);
        properties.add(squareHouse3);
        properties.add(circleHouse1);
        properties.add(circleHouse2);
        properties.add(circleHouse3);

        System.out.println(customerRequest(properties));

    }
    public static ArrayList<Properties> customerRequest(ArrayList<Properties> properties){
        ArrayList<Properties> requested = new ArrayList<>();
        for (Properties property : properties) {
            if (property.area() >= 600) {
                requested.add(property);
            }
        }
        return requested;
    }
}



/*
/*
A real estate agent asked you to write a program. He said that he has properties in the shapes of squares, rectangles,
circles, etc., and that he wants to market them by filtering according to the square meters in line with the wishes of his customers.

Tips:
Each property's name and features will be kept as an ArrayList.
Define an abstract class to keep name of the properties and calculate the area and subclasses to calculate the area of each shape.
Write a method that will take this ArrayList and return a property list whose areas are equal or more than the request of a client.

Example:
input :
properties of real estate agent :
    Square Houses
        SquareHouse-1 with 20 m side,
        SquareHouse-2 with 25 m side,
        SquareHouse-3 with 30 m side
    Rectangle Houses
        RectangleHouse-1 with 20 x 30,
        RectangleHouse-2 with 20 x 25
    Circle Houses
        CircleHouse-1 with 15 m radius,
        CircleHouse-2 20 m radius,
        CircleHouse-3 10 m radius

customer request : Houses with area under 600 square meters will not be accepted...



output :
[SquareHouse-2 , SquareHouse-3 , RectangleHouse-1 , CircleHouse-1 , CircleHouse-2 ]

 */
