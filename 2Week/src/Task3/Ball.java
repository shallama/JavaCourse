package Task3;

public class Ball extends SolidOfRevolution {
    public Ball(double radius){
        super(4*Math.PI*radius*radius*radius/3, radius);
    }
}
