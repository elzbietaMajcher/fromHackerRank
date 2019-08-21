package pairingSocks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairingSocksTest {


    int n = 9;
    int [] ar = new int[] {10 ,20, 20, 20, 10, 10, 30, 50, 10, 20}; // result, num of pairs: 3

    @Test
    public void sockMerchant() {

        int actual = PairingSocks.sockMerchant(n, ar);

        assertEquals(3,actual);


    }
}