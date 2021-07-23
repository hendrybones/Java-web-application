package com.pluralsight.calcengine;

import java.math.BigInteger;

public class BinaryCalculator extends ScientificCalculator implements BinaryInterface {
    private MiddlePerson person;


    public BinaryCalculator() {
        this.person = new MiddlePerson();


    }


    public String add(String a, String b) {
//
        int number1=Integer.parseInt(b,2);
        int number2=Integer.parseInt(b,2);
        int sum=number1 + number2;
        return Integer.toBinaryString(sum);
    }

    public String subTract(String a, String b) {
        int number1=Integer.parseInt(b,2);
        int number2=Integer.parseInt(b,2);
        int sum=number1 - number2;
        return Integer.toBinaryString(sum);
//        BigInteger number1 = new BigInteger(String.valueOf(a), 2);
//        BigInteger number2 = new BigInteger(String.valueOf(b), 2);
//        BigInteger sum = number2.subtract(number1);
//        return Integer.toBinaryString(2);
    }

    public String multi(String a, String b) {
        int number1 = Integer.parseInt(b, 2);
        int number2 = Integer.parseInt(b, 2);
        int sum = number1 * number2;
        return Integer.toBinaryString(sum);

    }
    public String divide (String a, String b){
            int number1 = Integer.parseInt(b, 2);
            int number2 = Integer.parseInt(b, 2);
            int sum = number1 / number2;
            return Integer.toBinaryString(sum);
        }
    }

