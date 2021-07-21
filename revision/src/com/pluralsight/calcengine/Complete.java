package com.pluralsight.calcengine;
import java.util.Scanner;
import java.util.Scanner.*;

public class Complete {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of row");
        int row=scan.nextInt();
        for (int i=1;i<=row;i++){
            //space
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //columns
            for (int k=1;k<=2*i-1;k++)
            {
                if (k==1 || k==2*i-1){

                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=row;i>=1;i--){
            //space
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //star
            for (int k=1;k<=2*i-1;k++){
                if (k==1 || k==2*i-1){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
