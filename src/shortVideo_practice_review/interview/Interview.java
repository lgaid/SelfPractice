package shortVideo_practice_review.interview;

public class Interview {


    public static void main(String[] args) {


        String[] names = {"Nora", "Ali", "Hira"};


        System.out.println(shortestName(names));


    }


    public static String shortestName(String[] name) {

        String shortest = name[0];

        for (int i = 0; i < name.length; i++) {
            if (name[i].length() <= shortest.length()) {
                shortest = name[i];
            }
        }
    return shortest;
    }




}


//Debug 20-28 check details and review