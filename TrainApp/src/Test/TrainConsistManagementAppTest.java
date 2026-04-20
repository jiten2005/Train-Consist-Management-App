public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    // Test Methods

    public static void testSearch_BogieFound() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = linearSearch(data, "BG309");

        System.out.println("Bogie Found: " + (result ? "PASS" : "FAIL"));
    }

    public static void testSearch_BogieNotFound() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = linearSearch(data, "BG999");

        System.out.println("Bogie Not Found: " + (!result ? "PASS" : "FAIL"));
    }

    public static void testSearch_FirstElementMatch() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = linearSearch(data, "BG101");

        System.out.println("First Element Match: " + (result ? "PASS" : "FAIL"));
    }

    public static void testSearch_LastElementMatch() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = linearSearch(data, "BG550");

        System.out.println("Last Element Match: " + (result ? "PASS" : "FAIL"));
    }

    public static void testSearch_SingleElementArray() {
        String[] data = {"BG101"};
        boolean result = linearSearch(data, "BG101");

        System.out.println("Single Element: " + (result ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        testSearch_BogieFound();
        testSearch_BogieNotFound();
        testSearch_FirstElementMatch();
        testSearch_LastElementMatch();
        testSearch_SingleElementArray();
    }
}