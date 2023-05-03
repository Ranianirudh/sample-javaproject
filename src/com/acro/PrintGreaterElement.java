package com.acro;

public class PrintGreaterElement {
    public void getGreaterElement(int[] input){
        for (int j : input) {
            if (j > 10) {
                System.out.println(+j);

            }

        }
    }

    public static void main(String[] args) {
        PrintGreaterElement element=new PrintGreaterElement();
        int[] arr={4,16,8,97,5};
        System.out.println("the Elements are:");
        element.getGreaterElement(arr);
    }
}
