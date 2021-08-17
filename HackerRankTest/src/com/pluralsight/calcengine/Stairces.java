package com.pluralsight.calcengine;

public class Stairces {


    public static void Stairs(){
       int n=5;
        for (int i= 0; i<= n; i++)
        {
//outer loop
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args){
        Stairs();
    }
}
