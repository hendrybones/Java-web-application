package com.pluralsight.calcengine;


public class Main {

    public static void main(String[] args) {

        int i,j,k;
        int rows=5;
        for (i=1; i<= rows ; i++)
        {
            for (j = rows; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if( i==1)
            {
                System.out.println("");
            }
            else
            {
                System.out.println("*");
            }
        }
        for (i=rows-1; i>= 1 ; i--)
        {
            for (j = rows; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for ( k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if(i==1)
                System.out.println("");
            else
                System.out.println("*");
        }


//        int sum=0;
//
//        for (int i=1;i<=10;i++)
//        {
//            System.out.println("sum");
//
//        }


//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

    }
}
