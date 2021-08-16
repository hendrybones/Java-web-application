package com.pluralsight.calcengine;

public class QuickSort {
    public static void QuickOne(int[]arr, int low,int high){
        if (low>high)
            return;

        int mid=low+(high-low)/2;
        int pivot=arr[mid];
        int i=low;
        int j=high;
        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot);
            j--;

            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
        }
    }
}
