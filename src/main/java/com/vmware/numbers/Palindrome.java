package com.vmware.numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int input=num;
        int rem, res=0;

        while(num>0){
            rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        if (input==res) {
            System.out.println(input+ " is a Palindrome");
        }else {
            System.out.println(input+ " is not a Palindrome");
        }
    }
}
