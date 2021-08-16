package com.pluralsight.calcengine;

import com.pluralsight.calcengine.Stack.Stack;

import java.util.EmptyStackException;

public class NewStack {
    private ListNode top;
    private  int length;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;

        }
    }
    public void Stack(){
        top=null;
        length=0;

    }
    public  int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int results=top.data;
        top=top.next;
        length--;
        return results;
    }
    public int peek(){
        if (isEmpty()){
            throw  new EmptyStackException();
        }
        return top.data;
    }
    public static void main(String[] args){
       NewStack stack=new NewStack();
        stack.push(15);
        stack.push(10);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
//        System.out.println(stack.peek());
    }
}
