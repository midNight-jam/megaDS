package com.darkRealm.SinglyLinkedList;

/**
 * Created by Jayam on 10/19/2016.
 */
public class SinglyLinkedList implements ISingleLinkedList {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {

    }

    @Override
    public void insertAtEnd(int e) {
        if (head == null) {
            Node temp = new Node(e);
            head = temp;
            tail = temp;
            return;
        }
        tail.next = new Node(e);
        tail = tail.next;
    }

    @Override
    public void insertAtBeg(int e) {
        if(head==null){
            Node temp = new Node(e);
            head = temp;
            tail = temp;
            return;
        }
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
    }

    public void insert(int e){
        insertAtEnd(e);
    }

    @Override
    public void remove(int e) {
        return;
    }

    @Override
    public void traverse(){
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.append(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Traversal : \n"+sb.toString());
    }

    public void removeDuplicates(){

    }
}
