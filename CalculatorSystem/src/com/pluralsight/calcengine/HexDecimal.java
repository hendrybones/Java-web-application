package com.pluralsight.calcengine;

import java.math.BigInteger;

public class HexDecimal implements BinaryInterface{
    private String a;
    private String b;

    public HexDecimal(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    // calculate methods
    @Override
    public String add(String a, String b) {
       int num1=Integer.parseInt(a,16);
       int num2=Integer.parseInt(b, 16);
       int sum=num1 + num2;
        return Integer.toHexString(sum);
    }

    @Override
    public String subTract(String a, String b) {
//        BigInteger number1= new BigInteger(String.valueOf(a),16);
//        BigInteger number2= new BigInteger(String.valueOf(b),16);
//        BigInteger sum=number2.subtract(number1);
//        return Double.parseDouble(sum.toString((2)));
        int num1=Integer.parseInt(a,16);
        int num2=Integer.parseInt(b, 16);
        int sum=num1 - num2;
        return Integer.toHexString(sum);

    }

    @Override
    public String multi(String a, String b) {
        int num1=Integer.parseInt(a,16);
        int num2=Integer.parseInt(b, 16);
        int sum=num1 * num2;
        return Integer.toHexString(sum);
    }

    @Override
    public String divide(String a, String b) {
     int num1=Integer.parseInt(a,16);
       int num2=Integer.parseInt(b, 16);
       int sum=num1 / num2;
       return Integer.toHexString(sum);


    }
}
