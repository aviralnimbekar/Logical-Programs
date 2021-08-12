package com.Bridgelabe;

import java.util.Scanner;

/**
 * Prints Fibonacci Series
 *
 * @author  - Aviral N
 * @version - 1.0
 * date     - 12-08-2021
 */
public class FibonacciSeries {

    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number n1");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number n2");
        int n2 = sc.nextInt();
        System.out.println("Enter nth number");
        int nthNum = sc.nextInt();

        //creating an object
        UtilityClass print = new UtilityClass();
        print.fibonSeries(n1, n2, nthNum);          //calling method
    }
}
