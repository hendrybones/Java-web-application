package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        //right triangle

        int i, j, row=6;

        for (i=1;i<row;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //left triangle
        for (i=0;i<row;i++){
            for (j=2*(row-i);j>=0;j--){
                System.out.print(" ");

            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //right angel triangle
        for (i=0;i<=row;i++){
            //space
            for (j=row-i;j>=0;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //diamond pattern
        for (i=1;i<=row;i++){
            //space
            for (j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //star
            for (j=1;j<=2*i-1;j++){
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
//                System.out.print("*");
            }
            System.out.println();
        }
        for (i=row;i>=1;i--){
            //space
            for (j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //downward triangle
        

    }

    }