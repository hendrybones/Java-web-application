package com.pluralsight.calcengine;

public class ScientificCalculator extends AdvancedCalculator{
    private  BinaryCalculator binaryCalculator;
    private double a;

    public ScientificCalculator(double a) {
        this.a = a;
        this.binaryCalculator=new BinaryCalculator();

    }

    public ScientificCalculator() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "ScientificCalculator{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }

    //calculate methods
    public double sin(double a){

        return  Math.sin(a);
    }
    public double cos(double a){

        return  Math.cos(a);
    }
    public double arcCos(double a){
        return  Math.acos(a);
    }
    public double tan(double a){

        return  Math.tan(a);
    }
    public double arcTan(double a){

        return  Math.atan(a);
    }
    public double log(double a){

        return  Math.log(a);
    }

}
