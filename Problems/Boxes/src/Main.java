import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);


        int tar1 = 0;
        int tar2 = 0;
        int tar3 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                tar2++;
            } else if (a[i] < b[i]) {
                tar3++;
            } else {
                tar1++;
            }
        }

        if (tar1 == 3) {
            System.out.println("Box 1 = Box 2");
        } else if ((tar1 == 2 && tar2 == 1) || (tar1 == 1 && tar2 == 2) || tar2 == 3) {
            System.out.println("Box 1 > Box 2");
        } else if ((tar1 == 2 && tar3 == 1) || (tar1 == 1 && tar3 == 2) || tar3 == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }

    }
}