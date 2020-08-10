package com.Week2;

public class TaskOne {
    int f = 5;
    int s = 4;

    public void printNum(int x){
        System.out.println(x);
    }
    public int setF(int i){
        f = i;
        return f;
    }
    public int setS(int k){
        s = k;
        return s;
    }
    public int sum (int x, int y){
        return x + y;
    }
    public int MaxNum(int x, int y) {
        //return Math.max(x, y);
        if (x > y)
            return x;
        else
            return y;
    }
}
