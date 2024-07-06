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
        assertEquals(0, divide(-10, 0));
    }
    
    @Test
    void sumOfDigitsTest() {
        assertEquals(-8, sumOfDigits(-12311));
    }

    @Test
    void maxNumberTest() {
        assertEquals(5, maxDigit(-125));
    }

    @Test
    void isDividedTest() {
        assertEquals(true, isDivided (10,1));
    }
}
