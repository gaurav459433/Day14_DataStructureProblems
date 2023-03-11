package com.bridgelabz.assignmentsrfp259.day14.datastructureproblems;

public class LinkedList {
    Node head;
    public void addFirst(Object data)
    {
        Node newNode = new Node(data);
        newNode.ref = head;
        head = newNode;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.ref != null)
                System.out.print(temp.data+" > ");
            else
                System.out.println(temp.data);
            temp = temp.ref;
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program: ");
        LinkedList list = new LinkedList();
        list.addFirst(70);
        list.display();
        list.addFirst(30);
        list.display();
        list.addFirst(56);
        list.display();
    }

}

