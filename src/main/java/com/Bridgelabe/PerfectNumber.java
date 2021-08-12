package com.Bridgelabe;

import java.util.Scanner;

/**
 * Prints Perfect number
 *
 * @author  - Aviral N
 * @version - 1.0
 * date     - 12-08-2021
 */
public class PerfectNumber {

    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for perfect number");
        int pNum = sc.nextInt();

        UtilityClass factor = new UtilityClass();
        factor.perfNumb(pNum);
    }
}
