package com.pluralsight.calcengine;

public class ArrayClass {
    public static void printArray(int[] ar){
        int n=ar.length;
        for (int i=0;i<n;i++){
            System.out.println(ar[i]+" ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] myArray=new int[5];

        myArray[0]=5;
        myArray[1]=2;
        myArray[2]=4;
        myArray[3]=9;
        myArray[4]=10;
        printArray(myArray);
        System.out.println(myArray.length);
        //last array length -1
        System.out.println(myArray[myArray.length-1]);
    }
    public static void reverseArray(int[]number,int start,int end){
        while (start<end){
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
    }
    public  int findMinimum(int[] arr){
        if (arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid inputs");
        }
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void moveZeros(int[] arr, int n){
        int j=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0&& arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if (arr[j]!=0){
                j++;

            }
        }
    }
    public static void zeroArr(){
        int[]arr={8,1,0,2,1,0,3};
        printArray(arr);
        moveZeros(arr,arr.length);
        printArray(arr);
    }
    public static int[] resize(int[]arr, int capacity){
        int[]temp=new int[capacity];
        for (int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args){
        ArrayClass arrayClass=new ArrayClass();
//        arrayClass.printArray(new int[]{3,5,7,9,12,19});
        int[]number={3,5,7,1,9,12,19};
//        reverseArray(number,0,number.length-1);
//        printArray(number);
        System.out.println(arrayClass.findMinimum(number));
//        zeroArr();
        int[]original=new int[]{4,5,1,2,4,9};
        System.out.println("the size of an array" +original.length);
        original=arrayClass.resize(original,10);
        System.out.println("the size of an array after resize" +original.length);


    }
}
