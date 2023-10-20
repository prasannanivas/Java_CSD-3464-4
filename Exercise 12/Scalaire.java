import java.util.Scanner;

public class Scalaire {
    public static void main(String[] args) {
        final int nMax = 10;
        int n = 0;

        Scanner scanner = new Scanner(System.in);

        
        do {
            System.out.print("Enter the effective size of the vectors (1 to " + nMax + "): ");
            n = scanner.nextInt();
        } while (n < 1 || n > nMax);

     
        double[] v1 = new double[n];
        double[] v2 = new double[n];

        
        System.out.println("Enter the components of vector v1:");
        for (int i = 0; i < n; i++) {
            System.out.print("v1[" + i + "]: ");
            v1[i] = scanner.nextDouble();
        }

        System.out.println("Enter the components of vector v2:");
        for (int i = 0; i < n; i++) {
            System.out.print("v2[" + i + "]: ");
            v2[i] = scanner.nextDouble();
        }

        double dotProduct = 0.0;
        for (int i = 0; i < n; i++) {
            dotProduct += v1[i] * v2[i];
        }

        System.out.println("The dot product of v1 and v2 is: " + dotProduct);

        scanner.close();
    }
}
