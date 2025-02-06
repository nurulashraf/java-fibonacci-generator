package fibonaccigenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A Java program to generate the Fibonacci sequence up to a specified number.
 */
public class FibonacciGenerator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter a positive integer: ");
            int n = input.nextInt();
            
            if (n < 0) {
                System.out.println("Error: Please enter a non-negative integer.");
            } else {
                System.out.println("Fibonacci sequence up to " + n + " terms:");
                generateFibonacci(n);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            input.close();
        }
    }

    /**
     * Generates and prints the Fibonacci sequence up to the specified number of terms.
     * @param n The number of terms to generate.
     */
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
