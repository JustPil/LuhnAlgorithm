package luhntests;

import luhn.Luhn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuhnTests {
    private final Luhn test = new Luhn();

    @Test
    public void validateValidNumber() {
        var result = test.validate("79927398713");
        Assertions.assertTrue(result);
    }
    @Test
    public void validateInvalidNumber() {
        var result = test.validate("11111111111");
        Assertions.assertFalse(result);
    }
    @Test
    public void validateNonNumericString() {
        var result = test.validate("ABC");
        Assertions.assertFalse(result);
    }
    @Test
    public void generateCheckDigit() {
        var result = test.generateCheckDigit("7992739871");
        Assertions.assertEquals(3, result);
    }
    @Test
    public void generateCheckDigitForInvalidString() {
        var result = test.generateCheckDigit("$$$");
        Assertions.assertEquals(-1, result);
    }
}
