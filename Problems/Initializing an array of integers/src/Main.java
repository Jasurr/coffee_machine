import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {12, 17, 8, 101, 33};

        System.out.println(Arrays.toString(numbers));
        final Scanner scanner = new Scanner(System.in); // 1
        final int a;                                    // 2
        final int b = scanner.nextInt() + a;            // 3
        final int c = 0;                                // 4
        c = b;                                          // 5
        System.out.println(c + 1);
    }
}