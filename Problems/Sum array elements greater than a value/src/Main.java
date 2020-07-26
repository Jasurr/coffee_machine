import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
        }
        int c = scanner.nextInt();
        int sum = 0;
        for (int val : b) {
            if (val > c) {
                sum += val;
            }
        }
        System.out.println(sum);
    }
}