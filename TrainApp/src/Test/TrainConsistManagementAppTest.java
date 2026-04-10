import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

public class TrainConsistManagementAppTest {

    // Regex patterns
    String trainRegex = "TRN-\\d{4}";
    String cargoRegex = "PET-[A-Z]{2}";

    // ✅ Valid Train ID
    @Test
    void testValidTrainID() {
        assertTrue(Pattern.matches(trainRegex, "TRN-1234"));
    }

    // ❌ Invalid Train ID
    @Test
    void testInvalidTrainID() {
        assertFalse(Pattern.matches(trainRegex, "TRAIN12"));
        assertFalse(Pattern.matches(trainRegex, "TRN12A"));
        assertFalse(Pattern.matches(trainRegex, "1234-TRN"));
    }

    // ❌ Wrong digit length
    @Test
    void testTrainIDDigitLength() {
        assertFalse(Pattern.matches(trainRegex, "TRN-123"));
        assertFalse(Pattern.matches(trainRegex, "TRN-12345"));
    }

    // ✅ Valid Cargo Code
    @Test
    void testValidCargoCode() {
        assertTrue(Pattern.matches(cargoRegex, "PET-AB"));
    }

    // ❌ Invalid Cargo Code
    @Test
    void testInvalidCargoCode() {
        assertFalse(Pattern.matches(cargoRegex, "PET-ab"));
        assertFalse(Pattern.matches(cargoRegex, "PET123"));
        assertFalse(Pattern.matches(cargoRegex, "AB-PET"));
    }

    // ❌ Lowercase not allowed
    @Test
    void testCargoUppercaseOnly() {
        assertFalse(Pattern.matches(cargoRegex, "PET-aB"));
    }

    // ❌ Empty input
    @Test
    void testEmptyInput() {
        assertFalse(Pattern.matches(trainRegex, ""));
        assertFalse(Pattern.matches(cargoRegex, ""));
    }

    // ❌ Extra characters
    @Test
    void testExactMatchOnly() {
        assertFalse(Pattern.matches(trainRegex, "TRN-1234X"));
        assertFalse(Pattern.matches(cargoRegex, "PET-ABC"));
    }
}