package com.company;

public class MyList {
    private Node head;
    private Node tail;

    class Node<T> {
        T data;
        Node next;
        Node prev;

        Node(T data) { this.data = data; }
    }

    public <T> void push(T data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node pull() {
        if (head != null) {
            return head;
        }
        return null;
    }

    public void pop() {
        if (head != null && head.next != null) {
            head.next = head;
        }
    }

    public void getList() {
        Node myObject = head;
        while (myObject != null) {
            System.out.println(myObject.data);
            myObject = myObject.next;
        }
    }
}
