package com.acro;

public class EvenAndOddCountInArray {
    int count=0;
    public int getEvenElementCount(int[] input){
        for(int i=0;i<input.length;i++){
        if(input[i]%2==0){
            count++;
        }
        }
        return count;
    }
    public int getOddElementCount(int[] input){
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        EvenAndOddCountInArray evenCount=new EvenAndOddCountInArray();
        EvenAndOddCountInArray oddCount=new EvenAndOddCountInArray();
        int[] array={3,8,10,7,23,67,98};

        System.out.println("the even count is:" + evenCount.getEvenElementCount(array));
        System.out.println("the odd count is:" + oddCount.getOddElementCount(array));
            }

}
