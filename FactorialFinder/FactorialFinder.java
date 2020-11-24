import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        scanner.close();
    }
}
