import java.util.Scanner;

import java.lang.Math;

public class Circle2 {
    private double radius;
    public static void main(String[] args) {
        System.out.println("What is the radius of your circle?");

        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        scanner.close();

        Circle2 newCircle = new Circle2(radius);
        System.out.println("Your circumference is: " + newCircle.Circumference());
        System.out.println("Your area is: " + newCircle.area());
    }
    
    public Circle2(double radius) {
        this.radius = radius;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public double Circumference() {
        return this.radius * 2 * Math.PI;
    }
}
