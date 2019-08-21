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


    public List<List<Integer>> prepare2 () {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        List<Integer> line1 = new ArrayList<Integer>();
        line1.add(-1);
        line1.add(1);
        line1.add(-7);
        line1.add(-8);
        List<Integer> line2 = new ArrayList<Integer>();
        line2.add(-10);
        line2.add(-8);
        line2.add(-5);
        line2.add(-2);
        List<Integer> line3 = new ArrayList<Integer>();
        line3.add(0);
        line3.add(9);
        line3.add(7);
        line3.add(-1);

        List<Integer> line4 = new ArrayList<Integer>();
        line4.add(4);
        line4.add(4);
        line4.add(-2);
        line4.add(1);

        lists.add(line1);
        lists.add(line2);
        lists.add(line3);
        lists.add(line4);
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
    @Test
    public void diagonalDifference2() {
        int expected = 1;
        List<List<Integer>> lists = prepare2();
        System.out.println(lists.size());
        int result = Diagonals.diagonalDifference(lists);
        assertEquals(1, result);

    }


}