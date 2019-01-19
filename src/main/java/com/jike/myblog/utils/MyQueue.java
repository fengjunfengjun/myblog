package com.jike.myblog.utils;

import java.util.LinkedList;
import java.util.Stack;

class MyQueue {


    LinkedList<Integer> inputStack=new  LinkedList<>();
    LinkedList<Integer> outputStack=new  LinkedList<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
            inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!outputStack.isEmpty())
            return outputStack.pop();
       while (!inputStack.isEmpty()){
           outputStack.push(inputStack.pop());
       }
       return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!outputStack.isEmpty())
            return outputStack.peek();
        while (!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }
        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.isEmpty()&&outputStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
