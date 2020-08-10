package com.Week4;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static Set<?> union(Set<?> set1, Set<?> set2){
        Set<Object> hs= new HashSet<>();

         for (Object set : set1){
             hs.add(set);
         }
        for (Object set : set2){
            hs.add(set);
        }
        return hs;
    }

    public static Set<?> intersect(Set<?> set1, Set<?> set2){
        Set<Object> hs = new HashSet<>();

        for (Object elm1 : set1) {
            for (Object elm2 : set2) {
                if (elm1 == elm2) {
                    hs.add(elm1);
                }
            }
        }
        return hs;
    }
}
