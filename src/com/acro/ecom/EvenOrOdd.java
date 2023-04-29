package com.acro.ecom;

public class EvenOrOdd {
    public boolean isEvenOrOdd(int n){
        if(n%2==0){
            System.out.println("given number "+n+" is Even");
            return true;
        }else{
            System.out.println("given number "+n+" is Odd");
        }
        return false;
    }

    public static void main(String[] args) {
        EvenOrOdd evenOdd=new EvenOrOdd();
        evenOdd.isEvenOrOdd(23);
    }
}
