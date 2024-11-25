package com.vmware.numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        boolean isNotPrime = false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isNotPrime = true;
                break;
            }
        }
        if (isNotPrime) {
            System.out.println(num + " is not a Prime");
        } else {
            System.out.println(num + " is a Prime");
        }
    }
}
