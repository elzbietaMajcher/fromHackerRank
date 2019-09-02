package kangaroo;

import org.junit.Test;

import static org.junit.Assert.*;

public class KangarooTest {

    int x1 = 0, v1 = 2, x2 = 5, v2 = 3; // NO



    @Test
    public void kangarooTest1() {
        String expected = "NO";

        String result = Kangaroo.kangaroo(x1, v1, x2, v2);

        assert expected.equals(result);


    }


    @Test
    public void kangaroo2() {
        String expected = "NO";
        String result = Kangaroo.kangaroo(21, 6 ,47, 3);
        assert expected.equals(result);
    }

    @Test
    public void kangaroo3() {
        String expected = "NO";
        String result = Kangaroo.kangaroo(43, 2 ,70, 2);
        assert expected.equals(result);
    }
}