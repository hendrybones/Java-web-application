package com.pluralsight.calcengine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SortingArray {
    private int maxValue =100;

    public static void main(String[] args){
//        generateArray();
        selectionSort();
//        bubbleSort(3);
//
//        int array[]={1,2,4,3,5};
//        Arrays.sort(array);
//        for (int i=0;i<=array.length-1;i++){
//            System.out.println(array[i]);
//        }
    }

    public static void generateArray( ){
        Long startTime = System.nanoTime();
        int[] array=new int[10];
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
//            int value = new Random().nextInt();
            array[i]=(int)(Math.random());
//            array[i]=value;
            System.out.println(array[i]);

        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("time  :"+ totalTime);

    }
    public static void insertionSort(int[] array){
        int[] number={};
        Arrays.sort(number);

        for (int i=0;i<array.length;i++){
            int current=array[i];
            int j=i-1;
            while (j>=0 &&array[j]>current){
                array[j+1]=array[i];
                j--;
            }
            array[j+1]=current;
        }

    }
    public static void selectionSort(){
        int[]arr={2,8,15,1,24,13,4};
        int n=7;
        for(int i=1;i<n;i++){
            for (int j=0;j<(n-1);j++){
                int k=j+1;
                int a=arr[j];
                int b=arr[k];
                if (b<a){
                    int temp1=b;
                    int temp2=a;
                }
            }
            for (int d=0;d<n;d++)
                System.out.println(arr[d]+"");
        }
    }
    public static void bubbleSort(int[] ar){
        int temp;
        for (int i=ar.length-1;i>0;i++){
            for (int j=0;j<1;j++){
                if (ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("the new sequence");
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]+",");
        }
        System.out.println();
    }

}
