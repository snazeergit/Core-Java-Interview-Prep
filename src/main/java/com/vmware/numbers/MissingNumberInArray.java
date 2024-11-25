package com.vmware.numbers;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 6, 7};
        int len = ar.length;
        int n = len + 1;
        int actualSum = 0;
        for (int j : ar) {
            actualSum += j;
        }
        //actualSum = Arrays.stream(ar).sum();
        int expectedSum = n * (n + 1) / 2;
        System.out.println("Missed number :" + (expectedSum - actualSum));
    }
}
