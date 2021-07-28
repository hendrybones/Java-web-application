package com.pluralsight.calcengine.Stack;

public class Stack {
    int stack[]=new int[5];
    int top=0;
    public void push(int data){
        stack[top]=data;
        top++;

    }
}
