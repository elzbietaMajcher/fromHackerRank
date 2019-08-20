package jumpingClouds;

import static org.junit.Assert.*;

public class CloudsTest {


    int [] given1 = new int[]{0, 0, 1, 0, 0, 1, 0}; //min jumps: 3
    int [] given2 = new int[]{0, 1, 0, 0, 0, 1, 0, 1, 0, 0}; //min jumps: 4
    int [] given3 = new int[] {0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0}; //min jumps: 9

    @org.junit.Test
    public void jumpingOnClouds() {

        int actual1 = Clouds.jumpingOnClouds(given1);
        int actual2 = Clouds.jumpingOnClouds(given2);
        int actual3 = Clouds.jumpingOnClouds(given3);
        int expected1 = 3;
        assertEquals(expected1, actual1);
        assertEquals(4, actual2);
        assertEquals(9, actual3);


    }
}