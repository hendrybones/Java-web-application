package com.pluralsight.calcengine.QuestionOne;

import java.util.LinkedList;

public class Question1List {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(20);
        list.add(30);//index x
        list.add(40);//index z
        System.out.println("prints all the " + list);
        //add inserting x at index z
        list.set(2,12);
        System.out.println("after adding y " + list);

        //deleting
        list.remove(1);
        System.out.println("after removing " + list);





    }
}
