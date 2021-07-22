package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        //rows
        for (int i=1;i<=5;i++){
            //space
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //columns
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=4;i>=1;i--){
            //space
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //star
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
	
    }
}
