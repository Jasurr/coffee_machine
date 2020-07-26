import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int max = 0;
        while (i > 0) {
            int a = scanner.nextInt();
            if (a % 4 == 0) {
                max = a > max ? a : max;
            }
            i--;
        }
        System.out.println(max);
    }
}