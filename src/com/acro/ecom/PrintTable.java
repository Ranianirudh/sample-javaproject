package com.acro.ecom;

public class PrintTable {
    public void printTable(int n){
        for(int i=1;i<=5;i++){
            int x=n*i;
            System.out.println(+n +" * " +i+" = " +x);
        }

    }
    public static void main(String[] args) {
        PrintTable pt=new PrintTable();
        pt.printTable(2);
    }
}
