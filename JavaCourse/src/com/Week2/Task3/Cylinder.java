package Task3;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height){
        super(Math.PI * radius*radius * height, radius);
        this.height = height;
    }
}
