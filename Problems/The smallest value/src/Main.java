import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int i = 1;
        long a = 1;
        while (i > 0) {
            a = a * i;
            if (a > m) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}