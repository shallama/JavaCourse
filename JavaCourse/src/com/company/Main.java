package com.company;


import com.Week6.Task1;
import com.Week6.Task2;
import com.Week6.Task3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        //t1.read("D:\\text.txt");
        //t2.make("D:\\text.txt");
        t3.findUserPhone("Ромашев", "D:\\text.txt");
        Task3.findNumInst(2005,"D:\\text.txt");
    }
}
