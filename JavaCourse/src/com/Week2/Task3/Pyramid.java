package Task3;

public class Pyramid extends Shape {
    public double s;
    public double h;

    public Pyramid(double s, double h){
        super(s * h / 3);
        this.h = h;
        this.s = s;
    }
}
