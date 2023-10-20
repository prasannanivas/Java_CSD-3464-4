import java.util.Scanner;

public class Intervalle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double x = scanner.nextDouble();

        if ((x >= 0 && x < 1) || (x >= 2 && x < 3) || (x >= -10 && x < -2)) {
            System.out.println("x belongs to I");
        } else {
            System.out.println("x does not belong to I");
        }

        scanner.close();
    }
}
