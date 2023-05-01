package com.acro;

public class SumOfTheArray {
    int sum=0;
    public int sum(int[] input) {
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfTheArray sum1=new SumOfTheArray();
        int[] arr={10,20,30,5,6};
        int sum=sum1.sum(arr);
        System.out.println("the sum of an array elements"+sum);


    }
}
