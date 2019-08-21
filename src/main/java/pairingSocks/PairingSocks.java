package pairingSocks;

import java.util.*;

public class PairingSocks {




    static int sockMerchant(int n, int[] ar) {
        int numOfPair = 0;

        Map<Integer, Integer> listOfSockColors = segregateToMap(ar);

        Collection <Integer> values = listOfSockColors.values();

        for (int v: values) {
            if (v>1){
                int pairs = v/2;
                numOfPair = numOfPair + pairs;
            }
        }
               return numOfPair;
    }

    public static Map<Integer, Integer> segregateToMap (int [] ar){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i]) + 1);
            }else {
                map.put(ar[i], 1);
            }
        }
        return map;
    }

}


