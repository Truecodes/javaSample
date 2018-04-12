package pkg;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testThatAdd2And2Returns4() {
        //setup
        int expected = 4;
        Calculator calc = new Calculator();
        int input1 = 2;
        int input2 = 2;
        //comment
        //execute
        int actual = calc.add(input1, input2);
        //test
        assertEquals(expected, actual);
    }

    @Test
    public void testThatSubtract() {
        new Calculator().subtract(5,2);
    }

}
