import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true; // Found
            }
            else if (cmp < 0) {
                low = mid + 1; // Search right
            }
            else {
                high = mid - 1; // Search left
            }
        }

        return false; // Not Found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // IMPORTANT: sort before binary search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID FOUND.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        sc.close();
    }
}