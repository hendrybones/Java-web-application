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
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public void delete(int position){
        if(position==1){
            head=head.next;
        }else
        {
            ListNode previous=head;
            int count =1;
            while (count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
        }
    }
    public ListNode deleteLast(){
        if (head==null || head.next==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while (current.next !=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;

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
    public boolean find(ListNode head,int searKey){
        if (head==null){
            return false;
        }
        ListNode current =head;
        while (current!=null){
            if (current.data==searKey){
                return true;
            }
            current=current.next;
        }
        return false;

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
//        sl.insertLast(11);
//        sl.insertLast(8);
//        sl.insertLast(1);

        sl.insert(1,3);
        sl.insert(2,5);
        sl.insert(2,4);
        sl.insert(1,6);
        sl.delete(1);
        sl.delete(2);
        sl.display();
//        System.out.println("length"+ ""+sl.length());
//        System.out.println(sl.deleteLast().data);

    }

}
