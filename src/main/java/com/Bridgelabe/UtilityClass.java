package com.Bridgelabe;

public class UtilityClass {
    /**
     * generates Fibonacci Series
     *
     * @param n1  n1 (1st num)
     * @param n2  n2 (2nd num)
     * @param nth nthNum (length)
     * @return series
     */
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

    /**
     * checks for perfect number
     *
     * @param pNum pNum
     */
    public void perfNumb(int pNum) {

        //variable
        int sum = 0;

        //Checking from one to half of the number
        for (int i = 1; i <= pNum / 2; i++) {

            //selecting factors within range
            if (pNum % i == 0) {
                sum += i;
            }
        }
        if (pNum == sum) {
            System.out.println("Sum of factor = " + sum + "\n"
                    + pNum + " is a perfect number");
        } else {
            System.out.println("Sum of factor = " + sum + "\n"
                    + pNum + " is not a perfect number");
        }
    }
}