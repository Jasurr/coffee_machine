import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tmp = 0;
        int usk = 0;
        boolean res = true;
        while (true) {
            int a = scanner.nextInt();
            if (tmp == 0) {
                tmp = a;
                continue;
            }
            if (a == 0) {
                break;
            }
            if (a > tmp) {
                if (usk == 2) {
                    res = false;
                    break;
                }
                usk = 1;
            } else if (a < tmp) {
                if (usk == 1) {
                    res = false;
                    break;
                }
                usk = 2;
            }
            tmp = a;
        }
        System.out.println(res);
    }
}