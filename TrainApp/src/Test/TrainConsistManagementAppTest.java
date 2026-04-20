import java.util.Arrays;

public class TrainConsistManagementApp {

    // Search method with validation
    public static boolean search(String[] arr, String key) {

        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    // ================= TEST CASES =================

    public static void testSearch_ThrowsExceptionWhenEmpty() {
        String[] data = {};

        try {
            search(data, "BG101");
            System.out.println("Exception When Empty: FAIL");
        } catch (IllegalStateException e) {
            System.out.println("Exception When Empty: PASS");
        }
    }

    public static void testSearch_AllowsSearchWhenDataExists() {
        String[] data = {"BG101","BG205"};

        try {
            search(data, "BG101");
            System.out.println("Allows Search: PASS");
        } catch (Exception e) {
            System.out.println("Allows Search: FAIL");
        }
    }

    public static void testSearch_BogieFoundAfterValidation() {
        String[] data = {"BG101","BG205","BG309"};
        boolean result = search(data, "BG205");

        System.out.println("Bogie Found: " + (result ? "PASS" : "FAIL"));
    }

    public static void testSearch_BogieNotFoundAfterValidation() {
        String[] data = {"BG101","BG205","BG309"};
        boolean result = search(data, "BG999");

        System.out.println("Bogie Not Found: " + (!result ? "PASS" : "FAIL"));
    }

    public static void testSearch_SingleElementValidCase() {
        String[] data = {"BG101"};
        boolean result = search(data, "BG101");

        System.out.println("Single Element: " + (result ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        testSearch_ThrowsExceptionWhenEmpty();
        testSearch_AllowsSearchWhenDataExists();
        testSearch_BogieFoundAfterValidation();
        testSearch_BogieNotFoundAfterValidation();
        testSearch_SingleElementValidCase();
    }
}