package com.pluralsight.calcengine;

public class Exeption {
    static  void Validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");

    }
    public static void main(String[] args) {
        Validate(13);
        multipleBlockException();

    }

    private static void multipleBlockException() {
        try {
            int a[]=new int[5];
            a[5]=30/0;

        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arryindex out of bound occurs");
        }
        catch (Exception e){
            System.out.println("system parent exception occurs");
        }
    }
}
