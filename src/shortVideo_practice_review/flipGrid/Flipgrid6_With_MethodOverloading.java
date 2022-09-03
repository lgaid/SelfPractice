package shortVideo_practice_review.flipGrid;

public class Flipgrid6_With_MethodOverloading {

    public static double sum(int a, double b){
        return a +b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(int args) {
        System.out.println("Default Main");
    }

    public static void main(String args) {
        System.out.println("Overloaded Main");
    }



}
