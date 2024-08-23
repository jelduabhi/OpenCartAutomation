package com.javaclasses;

public class Encapsulation {

    private String name;
    private String address;
    private String number;

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setNumber(String number){
        this.number=number;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getNumber(){
        return number;
    }

}
