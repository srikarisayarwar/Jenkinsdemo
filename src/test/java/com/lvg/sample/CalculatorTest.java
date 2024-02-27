package com.lvg.sample;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculatorsample calculator = new Calculatorsample();
        int result = calculator.sum(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSub() {
        Calculatorsample calculator = new Calculatorsample();
        int result = calculator.sub(8, 3);
        assertEquals(5, result);
    }
}



