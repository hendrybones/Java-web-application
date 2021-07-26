package com.pluralsight.calcengine;

public class AdvancedCalculator extends SimpleCalculator{
    private  double a;
    public   double b;


    //methods
    public double modulus(double a,double b){
        return a%b;
    }
    public double squareRoot(double a){
        return Math.sqrt(a);
    }
    public double expo(double base,double pw){
        return Math.pow(base,pw);
    }


}
