package DuplicateEncoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Main {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
        assertEquals(")))))(((((((((((((((((((",DuplicateEncoder.encode("AaA\1\1\2\0.$|()[]{}^?*+\\/\'\""));
        assertEquals(")))))",DuplicateEncoder.encode(")))))"));
    }
}