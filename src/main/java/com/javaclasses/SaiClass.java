package com.javaclasses;

public class SaiClass implements SampleInterface{

    int a=5;
    int b=6;
    @Override
    public void addition() {
        System.out.println("Addition is "+(a+b));
    }

    @Override
    public void multiplication() {
        System.out.println("multiplication is "+(a*b));
    }

    @Override
    public void division() {
        System.out.println("division is "+(a/b));
    }

    @Override
    public void subtraction() {
        System.out.println("subtraction is "+(a-b));
    }
}
