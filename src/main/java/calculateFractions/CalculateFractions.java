package calculateFractions;

import java.text.DecimalFormat;

public class CalculateFractions {


    static void plusMinus(int[] arr) {
        double denominator = arr.length;
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int val: arr) {
            if (val > 0) positive++;
            if (val < 0) negative++;
            if (val == 0) zero++;
        }


        DecimalFormat dF = new DecimalFormat();
        dF.setMaximumFractionDigits(6);
        dF.setMinimumFractionDigits(6);

        double positiveRatio = calculateFraction(positive, denominator);
        double negativeRatio = calculateFraction(negative, denominator);
        double zeroRatio = calculateFraction(zero, denominator);

        System.out.println(dF.format(positiveRatio));
        System.out.println(dF.format(negativeRatio));
        System.out.println(dF.format(zeroRatio));


    }

    static double calculateFraction (double numerator, double denominator){
        double result = numerator/denominator;

        return result;
    }

}
