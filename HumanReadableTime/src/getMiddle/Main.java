package getMiddle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {
    @Test
    public void evenTests() {
        assertEquals("es", getMiddle.getMiddle("test"));
        assertEquals("dd", getMiddle.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", getMiddle.getMiddle("testing"));
        assertEquals("A", getMiddle.getMiddle("A"));
    }
}
