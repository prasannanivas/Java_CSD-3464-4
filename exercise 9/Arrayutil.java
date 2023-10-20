public class Arrayutil {

    public static int findMinimum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void sortArray(int[] arr, boolean ascending) {
        if (arr.length <= 1) {
            return; // Nothing to sort
        }

        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (ascending ? arr[i - 1] > arr[i] : arr[i - 1] < arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5,-9,63,7663,23 };

        // Find the minimum and maximum
        int min = findMinimum(arr);
        int max = findMaximum(arr);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Sort the array in ascending order
        sortArray(arr, true);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        // Sort the array in descending order
        sortArray(arr, false);
        System.out.println("Descending order: " + Arrays.toString(arr));
    }
}
