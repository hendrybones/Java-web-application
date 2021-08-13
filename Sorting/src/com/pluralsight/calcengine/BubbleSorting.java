package com.pluralsight.calcengine;

public class BubbleSorting {

    public int[] bubbles(int[]arr){
        int i,j,temp=0;
        for ( i=0;i<arr.length;i++){
            for (j=0;j<arr.length-1-i;i++){
                 if (arr[j]>arr[j+1]){
                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
            }
        }
        return arr;

    }
}
