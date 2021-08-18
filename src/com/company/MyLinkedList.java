package com.company;

public class MyLinkedList {
    private Node head;

    public MyLinkedList(int value) {
        this.head = new Node(value);
    }

    public void addFirst(int value) {
        Node temp = head;
        Node nodeX = new Node(value);
        head = nodeX;
        nodeX.next = temp;
    }

    public void add(int index, int value) {
        Node temp = head;
        Node nodeX = new Node(value);
        //Vòng lặp for để tìm kiếm vị trí node mà mình muốn chèn
        for (int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        Node nodeTemp = temp.next;
        temp.next = nodeX;
        nodeX.next = temp;
    }

    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
