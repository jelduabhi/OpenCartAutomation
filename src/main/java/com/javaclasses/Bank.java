package com.javaclasses;

public abstract class Bank {

    public Bank(){
        System.out.println("test");
    }
    public void depositMoney(){
        System.out.println("Money is deposited");
    }

    public void withdrawMoney(){
        System.out.println("Money is deposited");
    }

    public abstract void interestRate();

}
