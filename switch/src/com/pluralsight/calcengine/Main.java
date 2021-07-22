package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double value1=100d;
        double value2=0.0d;
        double  results=0.0d;
        char opCode='d';

        switch (opCode){
            case 'a':
                results=value1+ value2;
                break;
            case 'b':
                results=value1-value2;
                break;
            case 'c':
                results=value1=value2;
                break;

            case 'd':
//                if (value2 !=0)
//                results=value1/value2;
                results=value2 !=0 ? value1/value2 :0.0d;
                break;
            default:
                System.out.println("invalid opCode" +opCode);
                results=0.0d;
                break;
        }
        System.out.println(results);


        }

    }

