package com.pluralsight.calcengine;

import java.math.BigInteger;

public class BinaryCalculator extends ScientificCalculator implements BinaryInterface {
    private MiddlePerson person;


    public BinaryCalculator() {
        this.person=new MiddlePerson();


    }


    public double add(double a, double b){
        BigInteger number1= new BigInteger(String.valueOf(a),2);
        BigInteger number2= new BigInteger(String.valueOf(b),2);
        BigInteger sum=number2.add(number1);
        return Double.parseDouble(sum.toString((2)));
    }
    public double subTract(double a,double b){
        BigInteger number1= new BigInteger(String.valueOf(a),2);
        BigInteger number2= new BigInteger(String.valueOf(b),2);
        BigInteger sum=number2.subtract(number1);
        return Double.parseDouble(sum.toString((2)));
    }
    public double multi(double a,double b){
        BigInteger number1= new BigInteger(String.valueOf(a),2);
        BigInteger number2= new BigInteger(String.valueOf(b),2);
        BigInteger sum=number2.multiply(number1);
        return Double.parseDouble(sum.toString((2)));
    }
    public double divide(double a,double b){
        BigInteger number1= new BigInteger(String.valueOf(a),2);
        BigInteger number2= new BigInteger(String.valueOf(b),2);
        BigInteger sum=number2.divide(number1);

        //Integer.parseInt(a,2);
//        int number2=Integer.parseInt(b,2);
//        int sum=number2.div;
//
        return Double.parseDouble(sum.toString((2)));
    }
}
