package Assignment3;

final public class Circle {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double computeArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

