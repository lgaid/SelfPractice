package day28_encapsulation;

public class TestPizzaObjects {


    public static void main(String[] args) {


        Pizza smallPizza = new Pizza("Small",2,1);
        Pizza largePizza = new Pizza("Large", 3, 2);

        System.out.println(smallPizza);
        System.out.println(largePizza);

    }


}
