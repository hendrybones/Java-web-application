package com.pluralsight.calcengine;

import com.pluralsight.calcengine.Interface.BinaryInterface;

public class ScientificCalculator extends AdvancedCalculator  {
    private  BinaryCalculator binaryCalculator;
    private  HexDecimal hexDecimal;
    private double a;

    //calculate methods
    public double sin(double a){
        return  Math.sin(Math.toRadians(a));
    }
    public double cos(double a){

        return  Math.cos(Math.toRadians(a));
    }
    public double arcCos(double a){

        return  Math.acos(Math.toRadians(a));
    }
    public double tan(double a){

        return  Math.tan(Math.toRadians(a));
    }
    public double arcTan(double a){

        return  Math.atan(Math.toRadians(a));
    }
    public double log(double a){

        return  Math.log(Math.toRadians(a));
    }


}