package com.acro;

public class MinimumElement
    {
        public int getMinElement(int[] input){
            int min=input[0];
            for(int i=0;i<input.length;i++){
                if (input[i]<min){
                    min=input[i];
                }
            }
            return min;
        }
        public static void main(String[] args) {
            MinimumElement minimumElement=new MinimumElement();
            int[] arr={89,43,5,8,23,};
            System.out.println(minimumElement.getMinElement(arr));
        }
}
