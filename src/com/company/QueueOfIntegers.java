package com.company;

import java.util.Arrays;

public class QueueOfIntegers {
    private int size;
    private int[] elements;

    public QueueOfIntegers(int cap) {
        elements = new int[cap];
    }

    public QueueOfIntegers() {
        this(8);
    }

    public void push(int v){
        if(size == elements.length){
            elements = Arrays.copyOf(elements, size<<1);
        }
        elements[size++] = v;
    }

    public void pop(){
        System.arraycopy(elements, 1, elements, 0, --size);
    }

    public int front(){
        return elements[0];
    }
    public boolean empty(){
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
