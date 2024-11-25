package com.vmware.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int input;
        double rem,res=0;
        int power=String.valueOf(num).length();
        input=num;
        while(num>0){
            rem=num%10;
            res=res+Math.pow(rem,power);
            num=num/10;
        }
        if (input==res){
            System.out.println(input+" is Armstrong Number");
        }else {
            System.out.println(input+" is not an Armstrong Number");
        }
    }
}