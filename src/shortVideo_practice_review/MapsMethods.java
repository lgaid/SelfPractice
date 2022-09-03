package shortVideo_practice_review;

import java.util.LinkedHashMap;

public class MapsMethods {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put(): inserts the key and value as a pair to the map
        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Emma");
        map.put(5,"Isabella");

        System.out.println("map = " + map);

        System.out.println("----------------------------------------------------");

        //size(): returns thw size (total number of pairs) of the map

        System.out.println(map.size());


        // get(key): returns the value of the given key from the map

        System.out.println(map.get(20));



        // replace(key, new value): replaces the value of the given key

        map.replace(10, "Muthur");
        System.out.println(map);


        // remove(key): removes the given key, and it's value from the map

        map.remove(10);
        System.out.println(map);
        System.out.println(map.size());



        // contains(key): checks if the given key  is contained in the map, returns boolean


        System.out.println(map.containsKey(25));
        System.out.println(map.containsKey(40));

        // containsValue(value): checks if the value is contained in the map, return boolean

        System.out.println(map.containsValue("Muhtur"));
        System.out.println(map.containsValue("Emma"));


        // isEmpty(): checks if the map is empty

        System.out.println(map.isEmpty());


        // equals(MapObject): checks if the map is equal to the given map in the argument, returns boolean

       LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(20,"George");
        map2.put(3,"Jack");
        map2.put(40,"Emma");
        map2.put(5,"Isabella");

        System.out.println(map2.equals(map));
        System.out.println(map2 == map);



        // clear(): removes all keys and values from the map, size will be set to 0

        map.clear();

        System.out.println(map);






    }


}
