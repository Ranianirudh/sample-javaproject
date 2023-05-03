package com.acro;

public class ArraySortedOrNot{
    public boolean sort(int[] arr){
        int prev=arr[0];
        for (int i=0; i<arr.length;i++){
            if(arr[i] < prev){
                return false;
            }
            prev=arr[i];

        }
        return true;
}
    public static void main(String[] args) {
        ArraySortedOrNot sortElement=new ArraySortedOrNot();
        int[] array={1,7,12,14,18};

        System.out.println(sortElement.sort(array));

    }
}
