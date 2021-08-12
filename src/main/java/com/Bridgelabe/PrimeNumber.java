package com.Bridgelabe;

import java.util.Scanner;

/**
 * Checks Prime number
 *
 * @author - Aviral N
 * @version - 1.0
 * date     - 12-08-2021
 */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = sc.nextInt();

        UtilityClass checkPrime = new UtilityClass();

        checkPrime.prime(userNum);
    }
}
