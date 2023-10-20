class GCD {
    public static void main(String[] args) {

        System.out.println(findPGDC(42, 24));
    }

    public static int findPGDC(int a, int b) {

        int max1 = Math.max(a, b);
        int min1 = Math.min(a, b);

        while (min1 != max1) {

            int mi1 = Math.min(max1 - min1, min1);
            int ma1 = Math.max(max1 - min1, min1);

            max1 = ma1;
            min1 = mi1;
        }

        return max1;
    }
}