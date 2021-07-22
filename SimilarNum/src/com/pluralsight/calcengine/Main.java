package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        int i,j;
        int rows=5;
        for (i = rows; i >= 1; i--)
        {
            for (j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
