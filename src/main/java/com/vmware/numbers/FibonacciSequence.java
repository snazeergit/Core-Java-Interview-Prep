package com.vmware.numbers;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int first = 0, second = 1;
        int next;

        if (num <= 0) {
            System.out.println("Please enter a Positive number");
        } else if (num == 1) {
            System.out.println(first);
        } else {
            System.out.print(first + " " + second + " ");
            for (int i = 3; i <= num; i++) {
                next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}
