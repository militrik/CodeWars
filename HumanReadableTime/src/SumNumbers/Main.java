package SumNumbers;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {

        Sum s = new Sum();

        //@Test
        //public void Test1(;)
        {
            assertEquals(0, s.GetSum(2, -2));
            assertEquals(-1, s.GetSum(-1, 0));
        }
    }
}
