package Task3;

public class Box extends Shape {
    public double v;

    public Box(double v){
        super(v);
        this.v = v;
    }

    public boolean add(Shape shape){
        if (v < shape.getVolume()){
            System.out.println("Оставшийся объем коробки: " + v);
            System.out.println("Объем фигуры: " + shape.getVolume());
            return false;
        }
        else {
            System.out.println("Оставшийся объем коробки: " + v);
            System.out.println("Объем фигуры: " + shape.getVolume());
            v = v - shape.getVolume();
            return true;
        }
    }

}
