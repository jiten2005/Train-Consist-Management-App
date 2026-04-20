import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search with validation
    public static boolean searchBogie(String[] arr, String key) {

        // ✅ Fail-fast validation
        if (arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Sort before binary search
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogies = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogies, key);

            if (found) {
                System.out.println("Bogie FOUND.");
            } else {
                System.out.println("Bogie NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}