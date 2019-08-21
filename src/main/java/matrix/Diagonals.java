package matrix;

import java.util.List;

public class Diagonals {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int absoluteDifference = 0;

        int sum1 = 0;
        int sum2 = 0;

        int rows = arr.size();
        arr = complete(arr, rows);


        for (int i = 0; i < rows; i++) {
            sum1 = sum1 + arr.get(i).get(i);
        }

        for (int i = 0; i < rows ; i++) {
            sum2 = sum2 + arr.get(rows - 1 - i).get(i);
        }


        absoluteDifference = sum1 - sum2;
        return Math.abs(absoluteDifference);
    }

    public static List<List<Integer>> complete(List<List<Integer>> arr, int rows) {
        for (List<Integer> list : arr) {
            while (list.size() == rows) {
                list.add(0);
            }
        }
        return arr;
    }


}
