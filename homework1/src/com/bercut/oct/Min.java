package com.bercut.oct;

public class Min {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (b < min){
            min =b;
        }
        if (c < min){
            min =c;
        }
        System.out.println(min + " is the smallest");


    }
}
