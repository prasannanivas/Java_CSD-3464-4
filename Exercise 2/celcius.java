import java.util.Scanner;

class Celcius{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the farenheit: ");
        int faren = scan.nextInt();
        scan.close();
        System.out.println("The celcius is " + (faren - 32)*(9/5));
    }

}