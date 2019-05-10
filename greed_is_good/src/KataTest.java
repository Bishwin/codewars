import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void greedyShouldReturn250() {
        assertEquals("Score for [5,1,3,4,1] must be 250:", 250, Kata.greedy(new int[]{5,1,3,4,1}));
    }

    @Test
    public void greedyShouldReturn1100() {
        assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, Kata.greedy(new int[]{1,1,1,3,1}));
    }

    @Test
    public void greedyShouldReturn450() {
        assertEquals("Score for [2,4,4,5,4] must be 450:", 450, Kata.greedy(new int[]{2,4,4,5,4}));
    }
}