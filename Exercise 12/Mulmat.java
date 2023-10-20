import java.util.Scanner;

public class Mulmat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entering the 1st matrix:");
        int rows1, cols1;
        System.out.print("Number of rows: ");
        rows1 = scanner.nextInt();
        System.out.print("Number of columns: ");
        cols1 = scanner.nextInt();

        double[][] mat1 = new double[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
                mat1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Entering the 2nd matrix:");
        int rows2, cols2;
        System.out.print("Number of rows: ");
        rows2 = scanner.nextInt();
        System.out.print("Number of columns: ");
        cols2 = scanner.nextInt();

        double[][] mat2 = new double[rows2][cols2];

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
                mat2[i][j] = scanner.nextDouble();
            }
        }

        if (cols1 != rows2) {
            System.out.println("Multiplication of matrices is impossible!");
            scanner.close();
            return;
        }

        double[][] prod = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
