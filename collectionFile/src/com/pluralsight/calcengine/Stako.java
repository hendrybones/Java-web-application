package com.pluralsight.calcengine;

import java.util.Iterator;
import java.util.Stack;

public class Stako {
    public static void main(String args[]){
        Stack<String> stack=new Stack<String>();
        stack.push("hendry");
        stack.push("mwamburi");
        stack.push("mkandoe");
        stack.pop();
        stack.peek();
        Iterator<String> itr=stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
