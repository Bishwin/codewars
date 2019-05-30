import static org.junit.Assert.*;
import org.junit.Test;

public class KeypadTest {

    @Test
    public void singleDigits() {
        assertEquals(1, Keypad.presses("1"));
        assertEquals(4, Keypad.presses("2"));
        assertEquals(4, Keypad.presses("3"));
        assertEquals(4, Keypad.presses("4"));
        assertEquals(4, Keypad.presses("5"));
        assertEquals(4, Keypad.presses("6"));
        assertEquals(5, Keypad.presses("7"));
        assertEquals(4, Keypad.presses("8"));
        assertEquals(5, Keypad.presses("9"));
        assertEquals(2, Keypad.presses("0"));
    }

    @Test
    public void inputContainsPunctuation() {
        assertEquals(38, Keypad.presses("g**xdOxiKQBaIVPCCS"));
    }

    @Test
    public void inputIsCaseInsensitive() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(9, Keypad.presses("lol"));
        assertEquals(9, Keypad.presses("lOl"));
    }

    @Test
    public void simpleTest1() {
        assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
    }

    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
    }
}
