package pkg;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testThatAdd2And2Returns4() {
        assertEquals(4, new Calculator().add(2, 2));
    }

}
