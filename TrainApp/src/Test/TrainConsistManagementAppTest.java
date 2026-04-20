public class TrainConsistManagementApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) break;
        }
    }

    // Helper method to compare arrays
    public static boolean isEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Test Methods

    public static void testSort_BasicSorting() {
        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        bubbleSort(input);

        System.out.println("Basic Sorting: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_AlreadySortedArray() {
        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        bubbleSort(input);

        System.out.println("Already Sorted: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_DuplicateValues() {
        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        bubbleSort(input);

        System.out.println("Duplicate Values: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_SingleElementArray() {
        int[] input = {50};
        int[] expected = {50};

        bubbleSort(input);

        System.out.println("Single Element: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_AllEqualValues() {
        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        bubbleSort(input);

        System.out.println("All Equal Values: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        testSort_BasicSorting();
        testSort_AlreadySortedArray();
        testSort_DuplicateValues();
        testSort_SingleElementArray();
        testSort_AllEqualValues();
    }
}