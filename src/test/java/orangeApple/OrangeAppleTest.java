package orangeApple;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrangeAppleTest {

    //GIVEN:
    int s = 7; int t = 11; int a = 5; int b = 15; int[] apples = new int[]{-2, 2, 1}; int[] oranges = new int[]{5, -6};

    //EXPECTED
    int appleExp = 1;
    int orangeExp = 1;


    @Test
    public void countApplesAndOranges() {
        OrangeApple.countApplesAndOranges(s,t,a,b,apples, oranges);
    }

    @Test
    public void calculateTest() {

        int resultApples = OrangeApple.calculate(s,t,a,apples);
        int resultOranges= OrangeApple.calculate(s,t,b,oranges);

        assertEquals(appleExp, resultApples);
        assertEquals(orangeExp, resultOranges);
    }
}