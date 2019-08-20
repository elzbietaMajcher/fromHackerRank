package jumpingClouds;

import static org.junit.Assert.*;

public class CloudsTest {


    int [] given1 = new int[]{0, 0, 1, 0, 0, 1, 0}; //min jumps: 3
    int [] given2 = new int[]{0, 1, 0, 0, 0, 1, 0, 1, 0, 0}; //min jumps: 4
    int [] given3 = new int[] {0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0}; //min jumps: 9

    @org.junit.Test
    public void jumpingOnClouds() {

        int actual = Clouds.jumpingOnClouds(given1);
        int expected = 3;
        assertEquals(expected, actual);


    }
}