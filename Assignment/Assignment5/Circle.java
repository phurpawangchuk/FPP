package Assignment5;
/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Circle extends Shape{
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    protected double calculateArea() {
        return Math.PI*radius*radius;
    }
}
