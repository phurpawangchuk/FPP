package Assignment3;

final public class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double computeArea(){
        return getLength() * getWidth();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
