import java.util.Scanner;

class Circle{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = scan.nextInt();
        scan.close();
        System.out.println("The radius is " + 3.14 * radius * radius );
    }

}