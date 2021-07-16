package com.pluralsight.abb;

public class Main {
    public static class Address{
        int streetNum;
        String city;
        String state;
        String country;
        Address(int street,String c,String st, String con){
            this.streetNum=street;
            this.city=c;
            this.state=st;
            this.country=con;
        }
    }
   public  static class StudentClass
    {
        int rollNum;
        String studentName;
        //create a HAs-A relationship with address class
        Address studentAddr;
        StudentClass(int roll,String name,Address addr){
            this.rollNum=roll;
            this.studentName=name;
            this.studentAddr=addr;

        }

    }

    public static void main(String[] args) {
        Address ad=new Address(55,"agra","up","india");
        StudentClass obj=new StudentClass(123,"chaitanya",ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}
