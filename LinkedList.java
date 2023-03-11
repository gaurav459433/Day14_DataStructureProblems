package com.bridgelabz.assignmentsrfp259.day14.datastructureproblems;

import java.util.Scanner;

public class LinkedList {
    Node head;

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.setRef(head);
        head = newNode;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null)
            head = newNode;
        else if (head.getRef() == null)
            head.setRef(newNode);
        else {
            while (temp.getRef() != null) {
                temp = temp.getRef();
            }
            temp.setRef(newNode);
        }
    }

    public void addAtPosition(Object data, int position) {
        int index = 0;
        Node newNode = new Node(data);
        Node left = head;
        Node right = left.getRef();

        while (index < (position - 1)) {
            left = left.getRef();
            right = right.getRef();
            index++;
        }
        newNode.setRef(right);
        left.setRef(newNode);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            if (temp.getRef() != null)
                System.out.print(temp.getData() + " > ");
            else
                System.out.println(temp.getData());
            temp = temp.getRef();
        }
    }

    public void deleteFirst()
    {
        head = head.getRef();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program: ");
        LinkedList list = new LinkedList();
//        System.out.println("Add Nodes at First: ");
//        list.addFirst(70);
//        list.display();
//        list.addFirst(30);
//        list.display();
//        list.addFirst(56);
//        list.display();
//        System.out.println("Add Nodes at Last: ");
//        list.addLast(56);
//        list.display();
//        list.addLast(30);
//        list.display();
//        list.addLast(70);
//        list.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Add Node Between 2 Nodes: ");
        list.addFirst(56);
        list.display();
        list.addLast(70);
        list.display();
        System.out.println("Enter 1 To Add Node 30 Between 56 & 70 : ");
        int position = sc.nextInt();
        list.addAtPosition(30, position);
        list.display();
        System.out.println("Delete First Element In LinkedList: ");
        list.deleteFirst();
        list.display();
    }
}

