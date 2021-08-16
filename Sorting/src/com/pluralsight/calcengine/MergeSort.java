package com.pluralsight.calcengine;

public class MergeSort {
    public static int[] mergerArray(int[]inputArray){
        int inputLength=inputArray.length;
        if (inputLength<2){
            return inputArray;
        }
        int midIndex=inputLength/2;
        int[] leftHalf=new int[midIndex];
        int[]rightHalf=new int[inputLength-midIndex];
        //adding values to the midIndex
        for (int i=0;i<midIndex;i++){
            leftHalf[i]=inputArray[i];

        }
        //adding values to the rightHalf
        for (int i=midIndex;i<inputLength;i++){
            rightHalf[i-midIndex]=inputArray[i];

        }
        mergerArray(leftHalf);
        mergerArray(rightHalf);
        merge(inputArray,leftHalf,rightHalf);
        //merge two array
        return inputArray;

    }
    private static void merge(int[] inputArray,int[] leftHalf,int[] rightHalf){
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int i=0;//iterator for left half
        int j=0;// iterator for right half
        int k=0;//iterator for merged array

        while (i<leftSize&& j<rightSize){
            if (leftHalf[i]<=rightHalf[j]){
                inputArray[k]=leftHalf[i];
                i++;
            }else {
                inputArray[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            inputArray[k]=leftHalf[j];
            i++;
            k++;

        }
            while (j<rightSize){
                inputArray[k]=rightHalf[j];
                j++;
                k++;
            }

    }
}
