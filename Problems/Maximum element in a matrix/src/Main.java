import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int max = a[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < a[i][j]) {
                    row = j;
                    col = i;
                    max = a[i][j];
                }
            }
        }
        System.out.println(col + " " + row);
    }
}