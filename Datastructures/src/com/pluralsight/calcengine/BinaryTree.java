package com.pluralsight.calcengine;

public class BinaryTree {
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            right=null;
            left=null;

        }

    }
    public class binary{
        Node root;
    }
    private Node addRecursive(Node current,int value){
        if (current==null)
            return new Node(value);
        if (value<current.value){
            current.left=addRecursive(current.left,value);
        }
        else if(value>current.value){
            current.right=addRecursive(current.right,value);
        }else {
            return current;
        }
        return current;

    }
    // method to start recursion root
    public void add(int value){
        root=addRecursive(root,value);
    }
    private bin
}
