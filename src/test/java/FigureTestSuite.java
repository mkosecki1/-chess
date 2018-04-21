import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FigureTestSuite {
    private static final String ORANGE = "ORANGE";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testGetColor() {
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Figures of chess should be BLACK or WHITE!");
        new Figure(ORANGE);
    }
}