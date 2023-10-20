import java.util.*;

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

    public double distanceBetween(Point second) {
        double dx = this.x - second.x;
        double dy = this.y - second.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class Triangle {
    private Point[] vertices = new Point[3];

    public Triangle(Point p1, Point p2, Point p3) {
        vertices[0] = p1;
        vertices[1] = p2;
        vertices[2] = p3;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < 2; i++) {
            perimeter += vertices[i].distanceBetween(vertices[i + 1]);
        }
        perimeter += vertices[2].distanceBetween(vertices[0]);
        return perimeter;
    }

    public boolean isIsosceles() {
        double side1 = vertices[0].distanceBetween(vertices[1]);
        double side2 = vertices[1].distanceBetween(vertices[2]);
        double side3 = vertices[2].distanceBetween(vertices[0]);

        return side1 == side2 || side1 == side3 || side2 == side3;
    }
}

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of triangles: ");

        int numTriangles = scanner.nextInt();

        Triangle[] triangles = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            Point p1 = getPoint(i + 1);
            Point p2 = getPoint(i + 1);
            Point p3 = getPoint(i + 1);
            triangles[i] = new Triangle(p1, p2, p3);
        }

        for (int i = 0; i < numTriangles; i++) {
            System.out.print("Triangle " + (i + 1));
            System.out.print("Perimeter: " + triangles[i].calculatePerimeter());
            if (triangles[i].isIsosceles()) {
                System.out.println("The triangle is isosceles");
            } else {
                System.out.println("The triangle is not isosceles");
            }
        }

        scanner.close();
    }

    public static Point getPoint(int triangleNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(triangleNumber + ": Construction of a new Point Please enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter y: ");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }
}
