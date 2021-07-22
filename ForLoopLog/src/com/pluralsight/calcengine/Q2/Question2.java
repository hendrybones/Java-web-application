package com.pluralsight.calcengine.Q2;

public class Question2 {
    public static void main(String[] args) {
        int r, c;
        int noOfLoops = 6;

        for (r = 0; r < noOfLoops; r++) {
//            if (r>=1){
//                System.out.print(" ");
//            } else{
//                System.out.print("     ");
//
//            }

            //space
            for (c = noOfLoops - r; c > 1; c--) {
                System.out.print(" ");
            }

            //column
            for (c = 0; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
