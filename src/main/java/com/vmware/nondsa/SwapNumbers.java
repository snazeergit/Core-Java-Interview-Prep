package com.vmware.nondsa;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Input");
        System.out.println("a "+a);
        System.out.println("b "+b);

        a=a+b;
        b=a-b; // a+b-b=a
        a=a-b; // a+b-(a)=a+b-a=b;
        System.out.println("Output");
        System.out.println("a "+a);
        System.out.println("b "+b);

    }
}
