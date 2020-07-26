import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double a, b, c, r;
        double s = 0, p = 0;
        switch (type) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                p = (a + b + c) / 2;
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                s = a * b;
                break;
            case "circle":
                r = scanner.nextInt();
                s = 3.14 * r * r;
                break;
        }
        System.out.println(s);
    }
}