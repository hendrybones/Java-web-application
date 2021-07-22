package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

        int i, j, k;
        int row = 6;
        for (i = 1; i < row; i++) {
            for (j = i; j < row; j++)
                System.out.println(" ");
            for (k = 1; k < (i * 2); k++)
                System.out.print("* ");
            System.out.println("");
//
//        }'
//        int i,j;
//
//        int row=6;
//        for (i=0;i<row;i++)
//        {
//            for(j=row-i;j>1;j--)
//            {
//                System.out.println(" ");
//            }
//            for (j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        }
    }}
