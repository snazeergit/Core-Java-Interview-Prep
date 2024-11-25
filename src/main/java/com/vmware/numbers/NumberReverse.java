package com.vmware.numbers;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int reminder;
        int result=0;
        System.out.println(num);
        while(num>0){
            reminder=num%10;
            result=result*10+reminder;
            num=num/10;
        }
        System.out.println(result);

    }
}
