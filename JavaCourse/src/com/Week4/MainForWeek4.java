package com.Week4;

import com.Week4.Task7.Student;

import java.util.*;
import java.util.function.BiFunction;

public class MainForWeek4 {
    // Task 1
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
    //Task 2
    public static void randomNum(){
        ArrayList<Integer> ar = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        int z = 1000000;
        int k = 1000000;
        for(int i = 0; i <= 1000000; i++){
            ar.add((int) Math.random());
            ll.add((int) Math.random());
        }

        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            ar.get((int) Math.random());
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            ll.get((int) Math.random());
        }
        System.out.println(System.currentTimeMillis() - start2);
    }

    //Task 4
    public static <K> Map<K, Integer> arrayToMap(K[] ks){
        Map<K, Integer> map = new HashMap();
        for(K el : ks){
            map.compute(el, new BiFunction<K, Integer, Integer>() {
                @Override
                public Integer apply(K k, Integer count) {
                    return count == null ? 1 : count + 1;
                }
            });
        }

        return map;
    }
    public static void mai(){
        //For task 1
       /* Collection<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(5);
        for(Integer s : list){
            System.out.println(s);
        }
        Collection<Integer> hs = new HashSet<>();
        System.out.println();
        hs = removeDuplicates(list);
        for (Integer k : hs){
            System.out.println(k);
        }*/

        //for task2
        //randomNum();

        //for task 3
       /* ArrayListIter<Integer> ar = new ArrayListIter<>(new Integer[]{1, 5, 4, 2});
        while (ar.hasNext()){
            System.out.println(ar.next());
        }*/

        //for Task 6
       /* HashMap<String, String> map = new HashMap<>();
        Product product = new Product(map);

        product.add("Бубен - 1", "Склад - 1");
        product.add("Скалка - 1", "Склад - 2");
        product.add("Бубен - 2", "Склад - 1");
        product.add("Скалка - 2", "Склад - 2");

        product.entrySet();
        product.keySet();
        product.values();*/

        //fot task 7
        System.out.println("Task7:");
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Timur", 4165, 1, new int[]{3, 4, 5, 4}));
        students.add(new Student("Robert", 4350, 3, new int[]{5, 4, 5, 5}));
        students.add(new Student("Avzal", 4266, 2, new int[]{3, 2, 3, 3})); // this will be should removed
        students.add(new Student("Rashid", 4365, 3, new int[]{3, 4, 3, 4}));
        students.add(new Student("Vova", 4280, 2, new int[]{4, 5, 3, 4}));
        System.out.println("Students before: ");
        for (Student st : students){
            System.out.println(st.name);
        }
        Student.clearBad(students);
        System.out.println();
        System.out.println("Students after: ");
        for (Student st : students){
            System.out.println(st.name);
        }
        System.out.println();
        Student.printStudents(students, 3);
    }
}
