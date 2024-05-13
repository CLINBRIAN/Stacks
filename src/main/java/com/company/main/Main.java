/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.main;

/**
 *
 * @author kamau
 */
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(5);
        stack.push(6);
        stack.push(2);
        stack.push(9);
        
       
       // stack.print();

        //System.out.println("pop"+stack.pop());
       //stack.print();
       // System.out.println("size is "+stack.size());
       // System.out.println("     "+stack.peek());
        
        
        
        Stack2 stack2 = new Stack2();
        stack2.push(7);
        stack2.push(5);
        stack2.push(4);
        
       //System.out.println(" pop "+ stack2.pop());
        System.out.println("peek "+stack2.peek());
        System.out.println(" pop "+ stack2.pop());
        System.out.println(" is empty "+ stack2.isEmpty());
        System.out.println(" size is "+ stack2.size());
        
        
    }
}
