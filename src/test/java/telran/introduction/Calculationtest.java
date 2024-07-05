package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telrun.Calculations.*;

import org.junit.jupiter.api.Test;

public class Calculationtest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }

    @Test
    void multiplyTest() {
        assertEquals(4, multiply(2, 2));
        }

    @Test
    void divideTest() {
        assertEquals(1, divide(2, 2));
    }
    
    @Test
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(123));
    }

    @Test
    void maxNumberTest() {
        assertEquals(7, maxDigit(123754));
    }

    @Test
    void isDividedTest() {
        assertEquals(true, isDivided (10,2));
    }
}
