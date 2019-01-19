package com.jike.myblog.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {
    LinkedList<Integer> inputStack;
    HashMap<Integer,Integer> lr;
    int size=0;
    public LRUCache(int capacity) {
            lr=new HashMap<>(capacity);
            inputStack=new LinkedList<>();
            size=capacity;
    }

    public int get(int key) {

       if(!inputStack.contains(key)){
           return -1;
       }
       else {
           inputStack.remove(Integer.valueOf(key));
           inputStack.push(key);
           return lr.get(key);
       }

    }

    public void put(int key, int value) {
        if(lr.size()>=size){
            lr.remove(inputStack.pollFirst());

        }
        if(inputStack.contains(key)){
            inputStack.remove(Integer.valueOf(key));
        }

        lr.put(key,value);
        inputStack.push(key);

    }
}
