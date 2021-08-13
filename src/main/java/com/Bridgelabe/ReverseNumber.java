package com.Bridgelabe;

import java.util.Scanner;

/**
 * Reversing a number
 *
 * @author - Aviral N
 * @version - 1.0
 * date     - 13-08-2021
 */
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = sc.nextInt();

        UtilityClass reverse = new UtilityClass();
        System.out.println(reverse.revNum(userNum));

    }
}
