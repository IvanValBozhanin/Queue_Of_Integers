package com.company;

public class Main {

    public static QueueOfIntegers queueOfIntegers = new QueueOfIntegers(3);

    public static void main(String[] args) {
        fillQueue();
        printQueue();

    }

    public static void fillQueue(){
        for(int i=0;i<20;++i){
            queueOfIntegers.push(i);
        }
    }

    public static void printQueue(){
        for(int i=0;i<20;++i){
            System.out.println(queueOfIntegers.front());
            queueOfIntegers.pop();
        }
    }
}
