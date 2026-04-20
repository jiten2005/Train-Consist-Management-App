import java.util.Scanner;

public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not Found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = linearSearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID FOUND in the consist.");
        } else {
            System.out.println("Bogie ID NOT FOUND in the consist.");
        }

        sc.close();
    }
}