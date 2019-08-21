package matrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DiagonalsTest {


    public List<List<Integer>> prepare () {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        List<Integer> line1 = new ArrayList<Integer>();
        line1.add(11);
        line1.add(2);
        line1.add(4);
        List<Integer> line2 = new ArrayList<Integer>();
        line2.add(4);
        line2.add(5);
        line2.add(6);
        List<Integer> line3 = new ArrayList<Integer>();
        line3.add(10);
        line3.add(8);
        line3.add(-12);

        lists.add(line1);
        lists.add(line2);
        lists.add(line3);
        return  lists;
    }


    @Test
    public void diagonalDifference() {
        int expected = 15;
        List<List<Integer>> lists = prepare();
//        int rowNum = 0;
//        for (List<Integer> list: lists  ) {
//            rowNum++;
//            System.out.println("List " + rowNum + ": ");
//            for (Integer i: list) {
//                System.out.println(i + ", ");
//            }
//        }

        System.out.println(lists.size());
        int result = Diagonals.diagonalDifference(lists);
        assertEquals(15, result);


    }
}