import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainFrameTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame(null);
    }
    
    @Test
    public void testCalcIndex() {
        double actual = this.mainFrame.calcIndex(100, 1.8);
        double expected =30.86419753;
        assertEquals(expected, actual, 0.02);
    }
}
