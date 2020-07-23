package com.company;

public class TaskFive {
    double[] ar = new double[2];

    public TaskFive(double[] ar){
        this.ar = ar;
    }

    public void reshenie(double[] ar) {

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (Math.random() * 1);
        }

        System.out.print("Массив: ");
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + "; ");
        }
        System.out.println();

        double min = ar[0];
        double max = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        double sred = sum / ar.length;
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Среднее арифметическое значение: " + sred);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
