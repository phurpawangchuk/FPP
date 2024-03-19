package A67.Lab.Inheritance;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Square extends ConcreteClosedCurve{
    private double side;

     Square(double side) {
        this.side = side;
    }

    public double computeArea(){
         return side*side;
    }
}
