package com.pluralsight.calcengine;

import com.pluralsight.calcengine.Interface.BinaryInterface;

public class BinaryCalculator implements BinaryInterface {
    private String a;
    private String b;

    public String add(String a, String b) {
//
        int number1=Integer.parseInt(a,2);
        int number2=Integer.parseInt(b,2);
        int sum=number1 + number2;
        return Integer.toBinaryString(sum);
    }

    public String subTract(String a, String b) {
        int number1 = Integer.parseInt(a, 2);
        int number2 = Integer.parseInt(b, 2);
        int sum = number1 - number2;
        return Integer.toBinaryString(sum);
//        BigInteger number1 = new BigInteger(String.valueOf(a), 2);
//        BigInteger number2 = new BigInteger(String.valueOf(b), 2);
//        BigInteger sum = number2.subtract(number1);
//        return Integer.toBinaryString(2);
    }

    public String multi(String a, String b) {
        int number1 = Integer.parseInt(a, 2);
        int number2 = Integer.parseInt(b, 2);
        int sum = number1 * number2;
        return Integer.toBinaryString(sum);

    }
    public String divide (String a, String b){
            int number1 = Integer.parseInt(a, 2);
            int number2 = Integer.parseInt(b, 2);
            int sum = number1 / number2;
            return Integer.toBinaryString(sum);
        }
    }

