package block;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    void testDefenders() {
        assertEquals(true, Kumite.block(new int[] { 1, 3, 5, 7 }, new int[] { 2, 4, 6, 8 }));
        assertEquals(false, Kumite.block(new int[] { 2, 9, 9, 7 }, new int[] { 1, 1, 3, 8 }));
        assertEquals(true, Kumite.block(new int[] { 10, 10, 1, 1 }, new int[] { 4, 4, 7, 7 }));
        assertEquals(true, Kumite.block(new int[] { }, new int[] { 1,2,3 }));
        assertEquals(false, Kumite.block(new int[] {1,2,3 }, new int[] { }));
        assertEquals(true, Kumite.block(new int[] {4, 9, 18, 6, 45, 39, 6, 26, 19 }, new int[] { 5, 15, 7, 28, 50, 7, 34 }));
        assertEquals(false, Kumite.block(new int[] {24, 8, 26, 28, 6, 32, 46, 5, 43, 19 }, new int[] {15, 50, 43, 40, 49, 15, 37 }));
    }

}