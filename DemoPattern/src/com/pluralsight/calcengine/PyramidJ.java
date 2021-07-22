package com.pluralsight.calcengine;

public class PyramidJ {

    public static void main(String[] args){
        int r, c;
        int noOfLoops = 6;

        for(r = 0; r < noOfLoops; r++){
//            System.out.print("X");
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
//        int x, cl;
//        for (x = 0; x < noOfLoops; x++){
////            System.out.print("X ");
//            for (cl = noOfLoops - x; cl < 1; cl--) {
//                System.out.print(" ");
//            }
//            for (cl = 0; cl <= x; cl++) {
//                System.out.print("* ");
//            }
//        }
    }

}
