import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double surface() {
        return Math.PI * radius * radius;
    }

    public boolean isInternal(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }
}

public class Exerciseten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle[] circles = new Circle[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the radius for circle " + (i + 1) + ":");
            double radius = scanner.nextDouble();
            System.out.println("Enter the x-coordinate for the center of circle " + (i + 1) + ":");
            double x = scanner.nextDouble();
            System.out.println("Enter the y-coordinate for the center of circle " + (i + 1) + ":");
            double y = scanner.nextDouble();

            Point center = new Point(x, y);
            circles[i] = new Circle(radius, center);
        }

        System.out.println("Enter a point to check if it's inside the circles:");
        System.out.print("Enter x-coordinate: ");
        double pointX = scanner.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double pointY = scanner.nextDouble();

        for (int i = 0; i < 3; i++) {
            Circle circle = circles[i];
            double circleSurface = circle.surface();
            boolean isInside = circle.isInternal(pointX, pointY);

            System.out.println("Circle " + (i + 1) + ":");
            System.out.println("Surface: " + circleSurface);
            System.out.println("The point is" + (isInside ? "" : " NOT ") + "inside the circle ");
        }

        scanner.close();
    }
}
