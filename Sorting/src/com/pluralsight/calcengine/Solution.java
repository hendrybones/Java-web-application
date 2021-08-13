package com.pluralsight.calcengine;

public class Solution {
    public static void MergeSort(int[]arr){
        MergeSort(arr,new int[arr.length],0,arr.length-1);

    }
    public static void MergeSort(int[]arr,int[] temp,int leftStart,int rightEnd){
        if (leftStart>=rightEnd)
        {
            return;
        }
        int middle=(leftStart + rightEnd)/2;
        MergeSort(arr,temp,leftStart,rightEnd);
        MergeSort(arr,temp,middle+1,rightEnd);
        mergeHalve(arr,temp,leftStart,rightEnd);

    }

    private static void mergeHalve(int[] arr,int[] temp, int leftStart, int rightEnd) {
        int leftEnd=(leftStart +rightEnd)/2;
        int rightStart=leftEnd+1;
        int size=rightEnd-leftStart;

        int left=leftStart;
        int right=rightStart;
        int index=leftStart;
        while (left<=leftEnd &&right <=rightEnd){
            if (arr[left]<=arr[right]){
                temp[index]=arr[left];
                index++;
                left++;
            }
            else {
                temp[index]=arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr,left,temp,index,leftEnd-left+1);
        System.arraycopy(arr,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,arr,leftStart,size);


    }

}
