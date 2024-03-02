package Assignment3;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        boolean option = true;

        while(option) {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");
            System.out.println("Enter E to Exit");
            System.out.print("Enter Option:");

            char input = sc.next().charAt(0);
            switch (input) {
                case 'C':
                    System.out.println("Enter the radius of the Circle: ");
                    double radius = sc.nextInt();
                    Circle circle = new Circle(radius);
                    area = circle.computeArea();
                    System.out.println("Area of a circle is  " + area);
                    break;

                case 'R':
                    System.out.println("Enter the width of the Rectangle: ");
                    double width = sc.nextDouble();
                    System.out.println("Enter the height of the Rectangle:");
                    double height = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(width, height);
                    area = rectangle.computeArea();
                    System.out.println("Area of a Rectangle is " + area);
                    break;

                case 'T':
                    System.out.println("Enter the base of the Triangle: ");
                    int base = sc.nextInt();
                    System.out.println("Enter the height of the Triangle:");
                    height = sc.nextInt();
                    Triangle triangle = new Triangle(base, height);
                    area = triangle.computeArea();
                    System.out.println("Area of a Triangle is " + area);
                    break;

                case 'E':
                    option = false;
                    System.out.println("Exited.");
                    break;

                default:
                    System.out.println("Invalid option selected.");
                    break;
            }
        }
    }
}
