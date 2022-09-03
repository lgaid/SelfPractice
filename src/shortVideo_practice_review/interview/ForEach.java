package shortVideo_practice_review.interview;

public class ForEach {

    public static void main(String[] args) {


        String[] names = {"Lucy", "Nemo", "Fawzy", "Al", "Carol", "Kat"};

        System.out.println(shortestName(names));



    }

    public static String shortestName(String[] names){

        String shortest = names[0];

        for (String each : names ) {
            if (each.length() < shortest.length()) {
                shortest = each;
            }
        }
        return shortest;
    }



}
