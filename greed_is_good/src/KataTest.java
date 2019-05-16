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

    @Test
    public void oneOneShouldReturn100() {
        assertEquals(100, Kata.greedy(new int[]{1,2,3,4,6}));
    }

    @Test
    public void oneFiveShouldReturn50() {
        assertEquals(50, Kata.greedy(new int[]{2,2,3,4,5}));
    }

    @Test
    public void threeOnesShouldReturn1000() {
        assertEquals(1000, Kata.greedy(new int[]{1,1,1,2,2}));
    }

    @Test
    public void threeTwosShouldReturn200() {
        assertEquals(200, Kata.greedy(new int[]{2,2,2,3,4}));
    }

    @Test
    public void threeOnesShouldReturn300() {
        assertEquals(300, Kata.greedy(new int[]{3,3,3,2,2}));
    }

    @Test
    public void threeFoursShouldReturn400() {
        assertEquals(400, Kata.greedy(new int[]{4,4,4,2,2}));
    }

    @Test
    public void threeFivesShouldReturn500() {
        assertEquals(500, Kata.greedy(new int[]{5,5,5,2,2}));
    }

    @Test
    public void ThreeSixesShouldReturn600() {
        assertEquals(600, Kata.greedy(new int[]{6,6,6,2,2}));
    }
}