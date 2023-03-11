package com.bridgelabz.assignmentsrfp259.day14.datastructureproblems;

public class Node {
    private Object data;
    private Node ref;
    Node(Object data)
    {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getRef() {
        return ref;
    }

    public void setRef(Node ref) {
        this.ref = ref;
    }
}
