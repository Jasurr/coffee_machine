import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        String str = "";
        switch (d) {
            case 1:
                str = "up";
                break;
            case 2:
                str = "down";
                break;
            case 3:
                str = "left";
                break;
            case 4:
                str = "right";
                break;
            case 0:
                str = "do not move";
                break;
            default:
                str = "error!";
        }
        if (d != 0 && !str.equals("error!")) {
            System.out.println("move " + str);
        } else {
            System.out.println(str);
        }
    }
}