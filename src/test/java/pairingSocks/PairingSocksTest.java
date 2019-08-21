package pairingSocks;

import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class PairingSocksTest {


    int n = 9;
    int [] ar = {10, 20, 20, 20, 10, 30, 50, 10, 20}; // result, num of pairs: 3

    @Test
    public void sockMerchant() {

        int actual = PairingSocks.sockMerchant(n, ar);

        assertEquals(3,actual);


    }

    @Test
    public void segregateToMap() {

        Map<Integer, Integer> result  = PairingSocks.segregateToMap(ar);

        Set<Map.Entry<Integer, Integer>> entrySet = result.entrySet();
        for(Map.Entry<Integer, Integer> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}