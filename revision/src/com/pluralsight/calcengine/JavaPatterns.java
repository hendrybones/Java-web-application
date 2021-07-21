package com.pluralsight.calcengine;

import java.awt.*;

public class JavaPatterns {
    public static void main(String[] args) {
//        //basic rectangle
//        int row=5;
//        //row
//        for (int i=1;i<=row;i++){
//            //space
//            for (int j=1;j<=row;j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

//increasing triangle
        for (int i = 1; i <= 5; i++) {
            //space
            //when i is 1 the for loop will iteret 5-1 which is 4 hence creating 4 space
            //next when i=2 for loop will take 5-2 =3 hence three space will be created
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");

            }
            //star
            //when i is 1 2*1 =2-1=1 where 1 star  is printed
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i==1 ) {
                    System.out.print("   ");
                }
                System.out.print("*");

            }
            System.out.println();
        }


        for (int i=1;i<=5;i++){
            //space
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k==2 * i - 1 ) {
                    System.out.print("*");
                }
                System.out.print(" ");

            }
            System.out.println();



        }
        for (int i=4; i>=1;i--){
            //space
            //if i=4 j=5-4 where it prints one space
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //star
            for (int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }


        }
    }
