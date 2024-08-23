package com.javaclasses;

public class PrameelaClass implements SampleInterface{
    int a=5;
    int b=6;
    int c=9;
    @Override
    public void addition() {
        System.out.println("Addition is "+(a+b+c));
    }

    @Override
    public void multiplication() {
        System.out.println("multiplication is "+(a*b*c));
    }

    @Override
    public void division() {
        System.out.println("division is "+(a/b));
    }

    @Override
    public void subtraction() {
        System.out.println("subtraction is "+(a-b-c));
    }
}

