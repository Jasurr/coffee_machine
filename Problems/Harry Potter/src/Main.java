import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String house = scanner.nextLine();
        String result = "";
        switch (house) {
            case "gryffindor":
                result = "bravery";
                break;
            case "hufflepuff":
                result = "loyalty";
                break;
            case "slytherin":
                result = "cunning";
                break;
            case "ravenclaw":
                result = "intellect";
                break;
            default:
                result = "not a valid house";
        }
        System.out.println(result);
    }
}