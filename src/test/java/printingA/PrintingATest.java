package printingA;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintingATest {

    String string1 = "aba";
    long input1 = 10; // output: 7 letters a

    String string2 = "a";
    long input2 = 1000000000000L; // output: 1000000000000


    @Test
    public void repeatedString() {
        long actual1 = PrintingA.repeatedString(string1,input1);
        long actual2 = PrintingA.repeatedString(string2,input2);
        assertEquals(7,actual1);
        assertEquals(1000000000000L,actual2);

    }
}