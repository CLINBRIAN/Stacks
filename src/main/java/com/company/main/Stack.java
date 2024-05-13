/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.main;

/**
 *
 * @author kamau
 */
public class Stack {
//this is stack using arrays
    int stack[];
    int top;
    int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    
//a method to push

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("the stack is full");
            return;
        }
        stack[++top] = data;
    }
    
//to remoive the value from the stack
    public int pop() {
        return stack[top--];
    }

    int size() {
        return top + 1;
    }
//to check the top value in the stack
    public int peek() {
        return stack[top];
    }
    
     void print() {
        for (int n : stack) {
            System.out.println(n + " ");
        }
    }

}
