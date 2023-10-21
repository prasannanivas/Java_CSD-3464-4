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
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}

class Triangle {
    private Point P1;
    private Point P2;
    private Point P3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.P1 = p1;
        this.P2 = p2;
        this.P3 = p3;
    }

    public double calculatePerimeter() {
        return  P1.distanceBetween(P2) + P2.distanceBetween(P3) + P3.distanceBetween(P1);
    }

    public boolean isIsosceles() {
        double side1 = P1.distanceBetween(P2);
        double side2 = P2.distanceBetween(P3);
        double side3 = P3.distanceBetween(P1);

        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public boolean isPointInside(Point point) {
        double vectorAP = (point.getX() - P1.getX()) * (P2.getY() - P1.getY())
            - (P2.getX() - P1.getX()) * (point.getY() - P1.getY());
        double vectorBP = (point.getX() - P2.getX()) * (P3.getY() - P2.getY())
            - (P3.getX() - P2.getX()) * (point.getY() - P2.getY());
        double vectorCP = (point.getX() - P3.getX()) * (P1.getY() - P3.getY())
            - (P1.getX() - P3.getX()) * (point.getY() - P3.getY());

        return (vectorAP >= 0 && vectorBP >= 0 && vectorCP >= 0) || (vectorAP <= 0 && vectorBP <= 0 && vectorCP <= 0);
}



}

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of triangles: ");

        int numTriangles = scanner.nextInt();

        Triangle[] trianglesArray = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            Point p1 = getPointFromUser(i + 1);
            Point p2 = getPointFromUser(i + 1);
            Point p3 = getPointFromUser(i + 1);
            trianglesArray[i] = new Triangle(p1, p2, p3);
        }

        System.out.print("Enter a point to check if it's inside the triangle: ");
        Point userPoint = getPointFromUser(0);


        for (int i = 0; i < numTriangles; i++) {
            System.out.println(
                    "***************************** Triangle" + (i + 1) + "*************************************");
            System.out.print("Perimeter: " + trianglesArray[i].calculatePerimeter() + " ");
            if (trianglesArray[i].isIsosceles()) {
                System.out.println("The triangle is isosceles");
            } else {
                System.out.println("The triangle is not isosceles");
            }
            if (trianglesArray[i].isPointInside(userPoint)) {
                System.out.println("The point is inside this triangle.");
            } else {
                System.out.println("The point is not inside this triangle.");
            }
        }

        scanner.close();
    }

    public static Point getPointFromUser(int triangleNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Triangle " + triangleNumber + ": Construction of a new Point Please enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter y: ");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }
}
