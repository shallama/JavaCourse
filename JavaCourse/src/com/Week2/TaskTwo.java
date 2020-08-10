package com.Week2;

public class TaskTwo {
    private double x;
    private double y;
    private double z;

    public TaskTwo(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double dlina (){
         return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarProizved(TaskTwo vector){
        return (x*vector.x + y*vector.y + z*vector.z);
    }
    public TaskTwo vectornoeProizveden(TaskTwo vector){
        TaskTwo v2 = new TaskTwo(y*vector.z - z*vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
        return v2;
    }
     public double cosYglaMejduVectorami(TaskTwo vector){
        return scalarProizved(vector)/(dlina() * vector.dlina());
     }
     public TaskTwo sum(TaskTwo vector){
        TaskTwo t2 = new TaskTwo(x+vector.x, y+vector.y, z+vector.z);
        return t2;
     }
     public TaskTwo raznost(TaskTwo vector){
         TaskTwo t2 = new TaskTwo(x-vector.x, y-vector.y, z-vector.z);
         return t2;
     }
     public static TaskTwo[] arrayVectors(int n){
        TaskTwo[] arrayVectors = new TaskTwo[n];
        for (int i = 0; i < n; i++){
            arrayVectors[i] = new TaskTwo(Math.random(), Math.random(), Math.random());
        }
        return arrayVectors;
     }

    @Override
    public String toString() {
        return "Вектор: {" + x +"; " + y+"; "+z+"}";
    }
}
