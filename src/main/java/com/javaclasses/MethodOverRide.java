package com.javaclasses;

public class MethodOverRide extends MethodOverLoad{

    @Override
    public void addition(int a, int b,int c) {
        int d=30;
        System.out.println("Addition is "+(a+b+c+d));
    }
}
