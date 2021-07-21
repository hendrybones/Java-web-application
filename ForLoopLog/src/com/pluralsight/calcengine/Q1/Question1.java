package com.pluralsight.calcengine.Q1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row =scan.nextInt();

        for (int i=row;i>0;i--){
            //space
            for (int j=row-i;j>=1;j--){
                System.out.print(" ");
            }
            //star
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=row; i++){
            //space
            for (int j=1;j<=row-i; j++){
                System.out.print(" ");
            }
            //star
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
