package A67.Lab.Abstract;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Main1 {
    public static void main(String[] args) {
        ClosedCurve[] shapes = { new Square(4),new Circle(5), new Rectangle(4,5), new Triangle(4,5)};

        for(ClosedCurve s: shapes){
            double area = s.computeArea();
            System.out.println(s.getClass().getSimpleName()+" "+ area);
        }
    }
}
