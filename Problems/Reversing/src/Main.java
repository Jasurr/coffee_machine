import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = 0;
        int b = a / 100;
        int c = (a / 10) % 10 ;
        int d = a % 10;
        if (d != 0) {
            result = d * 100 + c * 10 + b;
        }else {
            result = c * 10 + b;
        }
        System.out.println(result);
    }
}