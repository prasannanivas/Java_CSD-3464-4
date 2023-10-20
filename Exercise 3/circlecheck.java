import java.util.Scanner;

public class circlecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the x-coordinate of the circle's center: ");
        double centerX = scanner.nextInt();
        System.out.print("Enter the y-coordinate of the circle's center: ");
        double centerY = scanner.nextInt();
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextInt();
        System.out.print("Enter the x-coordinate of the point: ");
        double x = scanner.nextInt();
        System.out.print("Enter the y-coordinate of the point: ");
        double y = scanner.nextInt();

        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));

    
        if (distance < radius) {
            System.out.println("The point is inside the circle.");
        } else if (distance == radius) {
            System.out.println("The point is on the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }

        scanner.close();
    }
}
