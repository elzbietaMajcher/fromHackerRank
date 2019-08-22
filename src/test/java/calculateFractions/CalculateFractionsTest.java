package calculateFractions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFractionsTest {


    @Test
    public void calculateFraction() {
        int numerator = 2;
        int denominator = 4;
        double expected = 0.5;
        double actual = CalculateFractions.calculateFraction(numerator, denominator);
        assertEquals(expected, actual, 1);
    }

    @Test
    public void calculateFraction2() {
        double numerator = 5;
        double denominator = 31;
        double expected = 0.161290d;
        double actual = CalculateFractions.calculateFraction(numerator, denominator);
        System.out.println(actual);
        assertEquals(expected, actual, 1);
    }



}