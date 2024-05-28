import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {100, 10, 2, 0, -1, 4, 3, 1000};
        Arrays.sort(numbers);
        System.out.println("Numbers sorted from smallest to largest:");

        for (int number : numbers) {

            System.out.print(number + " ");

        }
    }
}
