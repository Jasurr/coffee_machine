import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, b = 0;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a == 0) {
                b = i;
            }
            i++;
        }
        System.out.println(b);
    }
}
