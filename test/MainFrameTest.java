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
    public void testCalcIndex1() {
        double actual = this.mainFrame.calcIndex(100, 1.8);
        double expected =30.86419753;
        assertEquals(expected, actual, 0.1);
    }

    
    @Test
    public void testCalcIndex2() {
        double actual = this.mainFrame.calcIndex(130, 1.7);
        double expected =44.98269896193;
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testCalcIndex3() {
        double actual = this.mainFrame.calcIndex(1, 1.7);
        double expected =0.34602076124567;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCalcIndex4() {
        double actual = this.mainFrame.calcIndex(600, 2.5);
        double expected =96.0;
        assertEquals(expected, actual, 0.1);
    }

    


}
