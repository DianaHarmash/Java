package com.company;

import java.util.*;

public class MapUse {

    public static void notMain() {
        ArrayList<Integer> myListInt = new ArrayList<>(List.of(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        mapInUse(myListInt);
        System.out.println("_______________");
        ArrayList<Character> myListChar = new ArrayList<>(List.of('a', 'b', 'b', 'c', 'a', 'c', 'c', 'd', 'a', 'd'));
        mapInUse(myListChar);
    }

    public static <T> void mapInUse(Collection<T> collection) {
        Map<T, Integer> myMap = new HashMap<>();
        collection.forEach(num -> {
            if (myMap.containsKey(num)) {
                myMap.replace(num, myMap.get(num) + 1);
            } else {
                myMap.put(num, 1);
            }
        });
        myMap.forEach((k, v) -> { System.out.println(k + " - " + v); });
    }

}
