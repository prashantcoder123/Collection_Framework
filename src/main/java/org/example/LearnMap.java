package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
//        Map<String , Integer> numbers =new HashMap<>();
        Map<String , Integer> numbers =new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four",4);
        numbers.put("five",5);
//        numbers.remove("three");
//if(!numbers.containsKey("two")){
//    numbers.put("two",2);
//}

//numbers.putIfAbsent("two",2);


//        System.out.println(numbers);
//for(Map.Entry<String ,Integer> e: numbers.entrySet()){
//    System.out.println(e);
//    System.out.println(e.getKey());
//    System.out.println(e.getValue());
//}

        System.out.println(numbers);
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());


    }
}
