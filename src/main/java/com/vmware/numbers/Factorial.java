package com.vmware.numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number: ");
            int num = new Scanner(System.in).nextInt();

            //int fact=1;
            BigInteger fact = BigInteger.ONE;

            for (int i = 2; i <= num; i++) {
                //fact=fact*i;
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of " + num + " :" + fact);
        } catch (OutOfMemoryError e) {
            System.out.println("Ran out of memory!");
        }
    }
}
/*
int:
The int data type has a maximum value of  2,147,483,647  (as noted earlier).
Factorials grow very quickly, so for numbers greater than 12, the result may exceed this limit,
leading to incorrect calculations (integer overflow).

long:
The factorial of 20 (20!) is the largest factorial that can be accurately stored in a long data type.
Beyond  20! , you must use a larger data type like BigInteger to avoid overflow.

BigInteger:
The maximum factorial that Java’s BigInteger can compute properly is theoretically
only limited by the amount of memory available, as BigInteger can handle arbitrarily large integers.
**/