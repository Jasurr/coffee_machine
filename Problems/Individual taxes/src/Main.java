import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.nextInt();
        }
        int max = c[0];
        int maxCom = b[0];
        int index = 1;
        for (int i = 0; i < c.length; i++) {
            if (max * maxCom < c[i] * b[i]) {
                index = i + 1;
                max = c[i];
                maxCom = b[i];
            }
        }
        System.out.println(index);
    }
}