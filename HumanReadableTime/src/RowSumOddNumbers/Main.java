package RowSumOddNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void test1() {
        assertEquals(125, RowSumOddNumbers.rowSumOddNumbers(5));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}
