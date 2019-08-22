package calculateFractions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFractionsTest {


   int [] given = new int[]{-4, 3, -9, 0, 4, 1 };

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
        double expected = 0.161290;
        double actual = CalculateFractions.calculateFraction(numerator, denominator);
        System.out.println(actual);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void plusMinus() {
        double result1 = 0.500000;
        double result2 = 0.333333;
        double result3 = 0.166667;

        CalculateFractions.plusMinus(given);


    }


    @Test
    public void staircase() {
        CalculateFractions.staircase(5);
    }
}