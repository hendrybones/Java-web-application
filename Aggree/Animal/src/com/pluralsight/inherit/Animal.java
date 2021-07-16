package com.pluralsight.inherit;

public class Animal {
    private int age;
    private String name;
    public Animal(int age,String name){
        super();
        this.age=age;
        this.name=name;
    }
    public Animal(int age){
        this.age=age;
        this.name=null;
    }
    public void Gorilla(int age) {
        super(age,"Gorilla");

    }
    public Gorilla() {
        super(5);
    }


    public static void main(String[] args) {


    }
}
