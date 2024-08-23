package com.javaclasses;

public class SampleClass extends Bank{

    static int a;
    static int b;

    public SampleClass(){
       a=20;
       b=30;
    }

    public SampleClass(int a,int b){
        SampleClass.a =a;
        SampleClass.b =b;
    }

    public void addition(){
        System.out.println("Addition is "+(a+b));
    }

    public static void sub(){
        System.out.println("Addition is "+(a-b));
    }

    private void test(){
        System.out.println("test");
    }


    @Override
    public void interestRate() {

    }
}
