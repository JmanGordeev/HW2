package com.company;

public class Main {

    public static void main(String[] args) {

        double a = 10;
        double b = 10;
        double c = 10;
        double p =(a+b+c)/2;
        double s = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        System.out.println(Math.round(s));

    }
}
