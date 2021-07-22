package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	for (int i=0;i<6;i++)
    {
        for (int j=0;j<=1;j++)
        {
            System.out.print(" ");
        }
        for (int k=0;k<=i;k++)
        {
            System.out.print("* ");
        }
        System.out.println();

    }
	for (int i=0;i>=0;i--){
	    for (int y=0;y<=6-i;y++){
	        System.out.print(" ");

        }
	    for (int k=0;k<=i;k++)
        {
            System.out.print("*");
        }
	    System.out.println();

        }
    }
}
