import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the value of N
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int N = scanner.nextInt();

        // Print the Fibonacci series up to the Nth term
        System.out.println("Fibonacci Series up to " + N + " terms:");
        for (int i = 0; i < N; i++) {

            System.out.print(fibonacci(i) + " ");

        }

        scanner.close();
    }

    // Method to calculate the Fibonacci number for a given term
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
