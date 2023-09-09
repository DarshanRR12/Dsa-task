package com.dsapractice;


class Node {
    int value;
    Node next;

    Node() {
    }

    Node(int value) {
        this.value = value;
    }
}


public class LinkedList {
    private Node head;
    private Node tail;

    private int length;

    public LinkedList() {
        Node newNode = new Node();
        head = newNode;
        tail = newNode;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head.next;
        while (temp != null) {
            System.out.print(temp.value + (temp.next != null ? " -> " : "\n"));
            temp = temp.next;
        }
    }

    public void appendList(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    public void deleteNode(int data) {
        Node currentNode = head;
        Node previousNode = null;

        if (currentNode != null && currentNode.value == data) {
            head = head.next;
        }
        while (currentNode != null && currentNode.value != data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            previousNode.next = currentNode.next;
        }
    }

    public void deleteAllOccurrences(int dataToDelete) {
        Node currentNode = head;
        Node previousNode = null;

        if (currentNode != null && currentNode.value == dataToDelete) {
            head = head.next;
        }

        while (currentNode != null) {
            if (currentNode.value == dataToDelete) {
                if (previousNode != null) {
                    previousNode.next = currentNode.next;
                }
            } else {
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void clearList() {
        head = null;
        System.out.println("List is cleared no nodes remaining.");
    }
}