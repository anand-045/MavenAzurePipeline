
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAddition() {
        assertEquals(30, Main.add(10, 20));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(5, Main.add(10, -5));
    }
}
