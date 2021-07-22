package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        int row =11;
        int noOfCol;

       for (int k=0;k<row;k++) {
           if (k<=5)
               noOfCol=k;
           else
               noOfCol=row-k-1;

           for (int l=0;l<noOfCol;l++)
               System.out.print("*");

           System.out.println();

       }
    }
}