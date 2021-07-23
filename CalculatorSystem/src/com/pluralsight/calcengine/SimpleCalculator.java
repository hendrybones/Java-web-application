package com.pluralsight.calcengine;

public class SimpleCalculator {
    private double a;
    private double b;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    //calculate methods
    public double add(double a, double b){
        return a +  b;
    }
    public double multi(double a, double b){
        return a *  b;
    }
    public double subtract(double a,double b){
        return a -  b;
    }
    public double divide(double a, double b){
        return a /  b;
    }
//    public Double add(String a, String b){
//        double d1=Double.parseDouble(a);
//        double d2=Double.parseDouble(b);
//
//        return d1 + d2;
//    }
//    public  Double subtract(String a, String b){
//        double d1=Double.parseDouble(a);
//        double d2=Double.parseDouble(b);
//
//        return d1 - d2;
//
//    }
//    public  Double multi(String a, String b){
//        double d1=Double.parseDouble(a);
//        double d2=Double.parseDouble(b);
//        return d1 * d2;
//
//    }
//    public  Double divide(String a, String b) {
//        double d1=Double.parseDouble(a);
//        double d2=Double.parseDouble(b);
//        return d1 - d2;
//    }
//


}
