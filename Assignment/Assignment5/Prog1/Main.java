package Assignment5.Prog1;
/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        Rectangle rectangle1 = new Rectangle("Red", 5.0, 5.0);
        Rectangle rectangle2 =  new Rectangle("Green", 6.0, 6.0);

        Circle circle1 = new Circle("Blue", 10);
        Circle circle2 = new Circle("Black", 20);

        Square square1 = new Square("Pink", 4);

        shapes[0] = rectangle1;
        shapes[1] = rectangle2;
        shapes[2] = circle1;
        shapes[3] = circle2;
        shapes[4] = square1;

        printTotal(shapes);

    }


    public static void printTotal(Shape[] shapes) {
        for (Shape s : shapes) {
            double area = s.calculateArea();
            double perimeter = s.calculatePerimeter();
            System.out.println(s.getClass().getName() + " , " +
                    "Area : " + area + ", " +
                    "Perimeter: " + perimeter);
        }
    }
}
