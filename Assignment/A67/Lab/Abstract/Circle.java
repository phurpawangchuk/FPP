package A67.Lab.Inheritance;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Circle extends ClosedCurve{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double computeArea() {
        return Math.PI*radius*radius;
    }
}
