import java.util.Scanner;

import java.lang.Math;

public class Circle {
    private static double Circumference;
    private static double area;
    
    public Circle(double radius) {
	}
	public double Circumference(double Circumference) {
        return Circle.Circumference = Circumference;
        
    }
    public void area(double area) {
        Circle.area = area;
    }
    
    public static void main(String[] args) {
        System.out.println("What is the radius?");
        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();
        scanner.close();
        Circle.area = scan * scan * Math.PI;
        Circle.Circumference = 2 * scan * Math.PI;
        System.out.println("Your circumference is: " + Circle.Circumference);
        System.out.println("Your area is: " + Circle.area);
    }

    public double Circumference(){
        return Circumference;
    }
	public char[] area() {
		return null;
	}


   



    

}


//Write a class that defines an object for a circle. This object should have a double parameter representing its radius.
//Write methods to calculate circumference and calculate area. Use the built-in math class in java for an accurate value of pi.
//Use the main method to ask the user for input and calculate both area and circumference.