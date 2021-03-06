import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneExampleTests {

    @Test
    public void returnsPhoneNumber() {
        assertEquals("(123) 456-7890",
                Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void inputArraySizeMustBe10() {
        assertEquals("input wrong size",
                Kata.createPhoneNumber(new int[] {7, 8, 9}));
    }

}