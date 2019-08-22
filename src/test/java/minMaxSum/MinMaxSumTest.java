package minMaxSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxSumTest {

    int[] actual = { 5, 1, 6, 2, 3, 4 };
    int[] actual2 = { 2, 1, 5, 3, 4 };
    int[] expected = { 1, 2, 3, 4, 5, 6 };

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MinMaxSum.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void miniMaxSum() {
        MinMaxSum.miniMaxSum(actual2);
    }
}