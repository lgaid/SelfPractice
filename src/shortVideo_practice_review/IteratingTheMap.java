package shortVideo_practice_review;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Emma");
        map.put(5,"Isabella");


        /*
        Iterating by keys:
            KeySet(): returns all the keys of the map(Set)
         */

        for (Integer eachKey : map.keySet()) {
            System.out.println(eachKey);
        }


        System.out.println("----------------------------------------------------");

         /*
        Iterating by values:
            values(): returns all the values of the map(Collection)
         */

        for (String eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--------------------------------------------------");

         /*
        Iterating by entries:
            entrySet(): returns all the entries of map (Set)
         */

        System.out.println("-----------------------------------------------------");

        for (Map.Entry<Integer, String> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.getKey() + " : "+ eachEntry.getValue());
        }






    }



}
