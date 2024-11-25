package com.vmware.numbers;

import java.util.Scanner;

public class GCDnLCM {
    public static void main(String[] args) {
        System.out.println("Please Enter two numbers");
        int n1 = new Scanner(System.in).nextInt();
        int n2 = new Scanner(System.in).nextInt();
        int gcd = 1;
        for (int i = 1; i < Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD :"+gcd);
        System.out.println("LCM "+(n1*n2/gcd));
    }
}

/*
Least Common Multiple(LCM):
The LCM of two numbers is the smallest positive integer that is a multiple of both numbers.
    n1=12
    12 multiples: 12, 24, 36, 48, 60, 72, 84, ...
    n2=18
    18 multiples: 18, 36, 54, 72, 90, 108, ...

    Now 36 is the first common number in both multiples so it must be LCM

Greatest Common Divisor(GCD):
The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.
    n1=12
    12 can be written as : 1x12, 2x6, 3x4,
    12 Divisors:  1,2,3,4,6,12
    n2=18
    18 can be written as : 1x18, 2x9, 3x6,
    18 Divisors: 1,2,3,6,9,18

    Now 6 is the greatest number that divides both numbers, so it must be GCD.


* The GCD of 12 and 18 is 6, since 6 is the largest number that divides both 12 and 18.
*The LCM of 12 and 18 is 36, since 36 is the smallest number divisible by both.
* */
