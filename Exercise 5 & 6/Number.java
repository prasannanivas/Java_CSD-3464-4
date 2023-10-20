import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero (and it is even)");
        } else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even");
            } else {
                System.out.println("The number is positive and odd");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println("The number is negative and even");
            } else {
                System.out.println("The number is negative and odd");
            }
        }
    }
}
