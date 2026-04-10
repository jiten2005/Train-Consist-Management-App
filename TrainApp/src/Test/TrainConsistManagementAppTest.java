import java.util.*;
import java.util.*;

public class TrainConsistManagementAppTest {

    // Bogie class inside main class
    static class Bogie {
        String type;
        int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return type + " | Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // UC10: Calculate total seating capacity using map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())      // extract capacity
                .reduce(0, Integer::sum);       // sum all values

        // Display total seats
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Display original list (unchanged)
        System.out.println("\nBogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}