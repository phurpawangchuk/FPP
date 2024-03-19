package A67.Lab.Inheritance;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Triangle extends ConcreteClosedCurve {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea(){
        return 0.5*base*height;
    }
}
