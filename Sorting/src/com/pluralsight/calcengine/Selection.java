package com.pluralsight.calcengine;

public class Selection {
    public static int[] SelectionSort(int[]list){
        int i,j,minValue,minIndex,temp=0;
        for (i=0;i<list.length;i++){
            minValue=list[i];
            minIndex=i;
            for (j=i;j<list.length;j++){
                if (list[i]<minValue){
                    minValue=list[j];
                    minIndex=j;
                }
            }
            if (minValue<list[i]){
                temp=list[i];
                list[i]=list[minIndex];
                list[minIndex]=temp;
            }
        }
        return list;

    }
}
