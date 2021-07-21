package com.pluralsight.calcengine.Q6;

public class Question6 {
    public static void main(String[] args){
        int i,j,k;
        int num;
        int row=5;

        for ( i = 0; i <row; i++)
        {
            num = 1;
            System.out.printf("%" + (row - i) * 2 + "s", "");
            for ( j = 0; j <= i; j++)
            {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
