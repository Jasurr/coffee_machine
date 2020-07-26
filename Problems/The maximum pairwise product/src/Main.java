import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
        }
        int max = b[0] * b[1];
        for (int i = 2; i < b.length; i++) {
            int temp = b[i] * b[i-1];
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(max);

    }
}