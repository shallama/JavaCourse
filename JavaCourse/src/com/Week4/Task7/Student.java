package com.Week4.Task7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Student {
    public String name;
    public int group;
    public int course;
    public int[] eval;

    public Student(String name, int group, int course, int[] eval){
        this.name = name;
        this.group = group;
        this.course = course;
        this.eval = eval;
    }

    public double averag(){
        double k = 0;
        for (int i = 0; i < eval.length; i++){
            k = eval[i] + k;
        }
        return (k/eval.length);
    }
    public static List<Student> clearBad(List<Student> students){
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()){
            Student st = iter.next();
            if (st.averag() < 3){
                iter.remove();
            }
        }
        /*for(Student st : students){
            if (st.averag() < 3) {
                students.remove(st);
            }
        }*/
        return students;
    }
    public static void printStudents(List<Student> students, int course){
        for (Student stud : students){
            if (stud.course == course){
                System.out.println("Имя студента: " + stud.name + ". Курс: " + stud.course);
            }
        }
    }
}
