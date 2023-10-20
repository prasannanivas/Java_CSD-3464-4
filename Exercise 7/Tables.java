public class Tables {
    public static void main(String[] args) {
        System.out.println("Tables of multiplication");

        for (int i = 2; i <= 10; i++) {
            System.out.println("\nTable of " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\n");
            }
        }
    }
}
