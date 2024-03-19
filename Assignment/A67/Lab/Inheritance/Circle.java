package A67.Lab.Inheritance;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Circle extends ConcreteClosedCurve{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * radius*radius;
    }
}
