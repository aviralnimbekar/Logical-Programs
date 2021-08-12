package com.Bridgelabe;

public class UtilityClass {

    public int fibonSeries(int n1, int n2, int nth) {


        int series = 0;
        for (int i = 1; i <= nth; i++) {

            //sum of previous two terms
            series = n1 + n2;
            //updating value of previous terms
            n1 = n2;
            n2 = series;
            System.out.println(series);
        }
        return series;
    }
}
