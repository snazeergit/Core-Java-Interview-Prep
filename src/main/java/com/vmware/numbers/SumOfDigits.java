package com.vmware.numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int rem, res = 0;
        while (num > 0) {
            rem = num % 10;
            res = res + rem;
            num = num / 10;
        }
        System.out.println(res);
    }
}
