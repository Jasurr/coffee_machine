import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        final int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; i + j < size; j++) {
                matrix[j][i + j] = i;
                matrix[i + j][j] = i;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < cubic.length; i++) {
//            int col = i;
//            int a = 1;
//            int b = i;
//            for (int row = 0; row < cubic[i].length; row++) {
//                if (row == col) {
//                    cubic[col][row] = 0;
//                } else if (row > col) {
//                    cubic[col][row] = a;
//                    a++;
//                } else {
//                    cubic[col][row] = b;
//                    b--;
//                }
//                System.out.print(cubic[col][row] + " ");
//            }
//            b = i;
//            a = 1;
//            System.out.println();
//        }
    }
}