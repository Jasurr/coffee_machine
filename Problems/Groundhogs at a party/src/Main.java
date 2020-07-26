import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        boolean second = scanner.nextBoolean();
        System.out.println(first >= 10 && first <= 20 && !second || first >= 15 && first <= 25 && second);
    }
}