import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Prime numbers up to " + N + ":");
        // Loop through numbers from 2 to N
        for (int i = 2; i <= N; i++) {
            // Check if the current number is prime
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Check for divisibility by numbers up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
