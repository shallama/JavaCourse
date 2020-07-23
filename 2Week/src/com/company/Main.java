package com.company;

import Task3.Ball;
import Task3.Box;
import Task3.Cylinder;
import Task3.Pyramid;
import Task4.BaseConverter;
import Task4.Farengeit;
import Task4.Kelvin;

public class Main {

    public static void main(String[] args) {
        //Для первого задания
        /*TaskOne t = new TaskOne();
        System.out.print("Переменная f = ");
        t.printNum(t.f);
        System.out.print("Измененная переменная f = ");
        t.printNum(t.setF(9));
        System.out.print("Переменная s = ");
        t.printNum(t.s);
        System.out.print("Измененная переменная s = ");
        t.printNum(t.setS(8));
        System.out.print("Сумма двух переменных:  ");
        t.printNum(t.sum(t.f, t.s));
        System.out.print("Наибольшее значение из этих двух переменных: ");
        t.printNum(t.MaxNum(t.f, t.s));
        System.out.println();*/

        //Для второго задания
        /*
        TaskTwo t2 = new TaskTwo(5, 4, 3);
        System.out.println("Длина вектора: " + t2.dlina());
        System.out.println("Скалярное произведение: " + t2.scalarProizved(new TaskTwo(8,2,1)));
        System.out.println("Векторное произведение: " + t2.vectornoeProizveden(new TaskTwo(8,2,1)));
        System.out.println("Косинус угла между векторами: " + t2.cosYglaMejduVectorami(new TaskTwo(8,2,1)));
        System.out.println("Сумма двух векторов: " + t2.sum(new TaskTwo(8,2,1)));
        System.out.println("Разность двух векторов: " + t2.raznost(new TaskTwo(8,2,1)));
        System.out.println();*/

        //Для задания 3
        /*
        Box d = new Box(300);
        System.out.println(d.add(new Ball(2)));
        System.out.println(d.add(new Pyramid(5, 6)));
        System.out.println(d.add(new Cylinder(5, 5)));*/



        //Для четвертого задания
        /*
        BaseConverter converter = new Farengeit();
        System.out.println("Перевод в фаренгейты: " + converter.convert(25) + "F");
        converter = new Kelvin();
        System.out.println("Перевод в келвины: " + converter.convert(25) + "K");
        System.out.println();*/


        //Для пятого задания
        /* double[] ar = new double[2];
        TaskFive t5 = new TaskFive(ar);
        t5.reshenie(ar);*/

    }
}
