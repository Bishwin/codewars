import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
    }

    @Test
    public void sampleTests1() {
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
    }

    @Test
    public void sampleTests2() {
        assertEquals("semynak", Kata.high("take me to semynak"));
    }

    @Test
    public void OtherTests() {
        assertEquals("taxi", OtherSolutions.Kata.high("man i need a taxi up to ubud"));
    }

    @Test
    public void OtherTests1() {
        assertEquals("volcano", OtherSolutions.Kata.high("what time are we climbing up to the volcano"));
    }

    @Test
    public void OtherTests2() {
        assertEquals("semynak", OtherSolutions.Kata.high("take me to semynak"));
    }
}