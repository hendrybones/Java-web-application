package com.pluralsight.calcengine;

public class AdvancedCalculator extends SimpleCalculator{
    private  double a;
    public   double b;

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "AdvancedCalculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

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
