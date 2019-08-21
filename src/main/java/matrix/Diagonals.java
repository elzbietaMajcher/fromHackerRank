package matrix;

import java.util.List;

public class Diagonals {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int absoluteDifference = 0;

        int sum1 = 0;
        int sum2 = 0;

        for (List<Integer> list: arr) {
            if (list.size() == 0){
                list.add(0);
                list.add(0);
            }
            if (list.size() == 1){
                list.add(0);
            }
        }

        sum1 = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
        sum2 = arr.get(2).get(0) + arr.get(1).get(1) + arr.get(0).get(2);

        absoluteDifference = sum1 - sum2;
        return Math.abs(absoluteDifference);
    }


}
