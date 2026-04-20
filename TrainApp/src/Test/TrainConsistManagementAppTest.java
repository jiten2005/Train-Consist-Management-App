import java.util.Arrays;

public class TrainConsistManagementApp {

    // Method to sort using Arrays.sort()
    public static void sortBogieNames(String[] arr) {
        Arrays.sort(arr);
    }

    // Helper method to compare arrays
    public static boolean isEqual(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    // Test Methods

    public static void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        sortBogieNames(input);

        System.out.println("Basic Alphabetical Sorting: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_UnsortedInput() {
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        sortBogieNames(input);

        System.out.println("Unsorted Input: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};

        sortBogieNames(input);

        System.out.println("Already Sorted: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        sortBogieNames(input);

        System.out.println("Duplicate Names: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};

        sortBogieNames(input);

        System.out.println("Single Element: " + (isEqual(input, expected) ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        testSort_BasicAlphabeticalSorting();
        testSort_UnsortedInput();
        testSort_AlreadySortedArray();
        testSort_DuplicateBogieNames();
        testSort_SingleElementArray();
    }
}