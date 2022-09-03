package shortVideo_practice_review;

import java.util.*;

public class MapsDemo {


    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); // accepts null, random order
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(50,"Isabella");

        System.out.println("hashMap = " + hashMap);
        
        

        System.out.println("--------------------------------------------------------------");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(50,"Isabella");
        linkedHashMap.put(null,null);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("--------------------------------------------------------------");

        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(10,"Arthur");
        hashTable.put(20,"George");
        hashTable.put(3,"Jack");
        hashTable.put(40,"Emma");
        hashTable.put(50,"Isabella");
        //hashTable.put(null,null);

        System.out.println("hashTable = " + hashTable);


        System.out.println("--------------------------------------------------------------");

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(50,"Isabella");
        //treeMap.put(null,null);


        System.out.println("treeMap = " + treeMap);





    }


}
