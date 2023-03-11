package com.bridgelabz.assignmentsrfp259.day14.datastructureproblems;

public class LinkedList {
    public void elements(Object data) {
        Node newNode = new Node(data);
        System.out.print(newNode.data + " ");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program: ");
        LinkedList list = new LinkedList();
        list.elements(56);
        list.elements(30);
        list.elements(70);
    }

}

