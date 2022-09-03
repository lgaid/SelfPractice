package shortVideo_practice_review;

public class TryCatch_ThrowsKeyWord {


    public static void main(String[] args) throws InterruptedException {



        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("World");

        Thread.sleep(4000);

        System.out.println("How are you?");

        sleep5seconds();







    }
public static void sleep5seconds() throws InterruptedException{
        Thread.sleep(5000);
}


public static void test(){

    try {
        sleep5seconds();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


}



}
