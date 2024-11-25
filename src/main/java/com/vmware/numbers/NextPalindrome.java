package com.vmware.numbers;

import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int rem,res=0;

        for(int i=num+1;i<Integer.MAX_VALUE;i++){
            num=i;
            if(num-1>=0 && num-1<9){
                System.out.println((num+1)+" is the next Palindrome");
                break;
            }
            while(num>0) {
                rem = num % 10;
                res = res * 10 + rem;
                num = num / 10;
            }
            if(i==res){
                System.out.println(res+" is the next Palindrome");
                break;
            }else{
                res=0;
            }
        }
    }
}