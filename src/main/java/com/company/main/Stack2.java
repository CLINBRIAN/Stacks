/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.main;

/**
 *
 * @author kamau
 */
public class Stack2 {

    //this is by using linked list
    private Node top;
    private int size;

    //node class
    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//constructor of our Stack2
    public Stack2() {
        this.top = null;
        this.size = 0;
    }

//method to push a value
    public void push(int data) {
        Node newNode = new Node(data);
        if (top != null) {
            top.next = newNode;
        }
        top = newNode;
        size++;
    }
//method to pop

    public int pop() {
        if (isEmpty()) {
            return ' ';
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    //peek method
    public int peek() {
        if (isEmpty()) {
            return ' ';
        }
        return top.data;
    }
//method to check that the list is empty

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
