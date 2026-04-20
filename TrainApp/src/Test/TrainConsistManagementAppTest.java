import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    // Wrapper (handles sorting + empty array)
    public static boolean search(String[] arr, String key) {
        if (arr.length == 0) return false;

        Arrays.sort(arr); // handle unsorted input
        return binarySearch(arr, key);
    }

    // ================= TEST CASES =================

    public static void testBinarySearch_BogieFound() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = search(data, "BG309");

        System.out.println("Bogie Found: " + (result ? "PASS" : "FAIL"));
    }

    public static void testBinarySearch_BogieNotFound() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = search(data, "BG999");

        System.out.println("Bogie Not Found: " + (!result ? "PASS" : "FAIL"));
    }

    public static void testBinarySearch_FirstElementMatch() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = search(data, "BG101");

        System.out.println("First Element: " + (result ? "PASS" : "FAIL"));
    }

    public static void testBinarySearch_LastElementMatch() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = search(data, "BG550");

        System.out.println("Last Element: " + (result ? "PASS" : "FAIL"));
    }

    public static void testBinarySearch_SingleElementArray() {
        String[] data = {"BG101"};
        boolean result = search(data, "BG101");

        System.out.println("Single Element: " + (result ? "PASS" : "FAIL"));
    }

    public static void testBinarySearch_EmptyArray() {
        String[] data = {};
        boolean result = search(data, "BG101");

        System.out.println("Empty Array: " + (!result ? "PASS" : "FAIL"));
    }

    public static void testBinarySearch_UnsortedInputHandled() {
        String[] data = {"BG309","BG101","BG550","BG205","BG412"};
        boolean result = search(data, "BG205");

        System.out.println("Unsorted Input Handled: " + (result ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        testBinarySearch_BogieFound();
        testBinarySearch_BogieNotFound();
        testBinarySearch_FirstElementMatch();
        testBinarySearch_LastElementMatch();
        testBinarySearch_SingleElementArray();
        testBinarySearch_EmptyArray();
        testBinarySearch_UnsortedInputHandled();
    }
}