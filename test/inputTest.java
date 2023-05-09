import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class inputTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame(null);
    }

    @Test
    public void testCheckInput1(){
        boolean actual = this.mainFrame.checkInput("a");
        assertFalse(actual);
    }

    @Test
    public void testCheckInput2() {
        boolean actual = this.mainFrame.checkInput("55");
        assertTrue(actual);
    }
}
