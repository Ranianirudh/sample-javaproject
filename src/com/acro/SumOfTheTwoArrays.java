package com.acro;

public class SumOfTheTwoArrays {
    public int getSum(int[] input,int[] input1){
        int sum=0;
        int maxLength=(input.length>input1.length ? input.length : input1.length );//Ternary operator
        for(int i=0;i<maxLength;i++){
            if(input.length>i)
                 sum=sum+input[i];
                if(input1.length>i)
                    sum=sum+input1[i];
            }
        return sum;
    }
    public static void main(String[] args) {
        SumOfTheTwoArrays sum=new SumOfTheTwoArrays();
        int[] arr1={2,1,9,43,78};
        int[] arr2={8,7,99};
        System.out.println(sum.getSum(arr1,arr2));
    }
}
