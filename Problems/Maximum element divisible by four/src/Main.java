import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (b % 4 == 0) {
                max = max < b ? b : max;
            }
        }
        System.out.println(max);
    }
}