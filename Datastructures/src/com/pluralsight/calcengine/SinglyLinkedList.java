package com.pluralsight.calcengine;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current=head;
        while (current !=null){
            System.out.println(current.data+"--->");
            current=current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if (head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;

    }
    public  void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insert(int position,int value){
        ListNode node=new ListNode(value);
        if (position==1){
            node.next=head;
            head=node;
        }else {
            ListNode previous=head;
            int count=1;
            while (count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=node;
            node.next=current;
        }
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if (head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while (null !=current.next){
            current=current.next;
        }
        current.next=newNode;

    }
    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
//        sl.head=new ListNode(10);
//        ListNode second=new ListNode(1);
//        ListNode third=new ListNode(8);
//        ListNode fourth=new ListNode(11);
//
//        //now will connect them together to form a chain
//        sl.head.next=second;
//        second.next=third;
//        third.next=fourth;
        sl.insertLast(11);
        sl.insertLast(8);
        sl.insertLast(1);
        sl.display();
        System.out.println("length"+ ""+sl.length());
    }

}
