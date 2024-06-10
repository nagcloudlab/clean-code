package com.example.iterator;

/*
    data structure : collection of objects in memory
    iterator => a object with iteration logic
    data structure + iterator = iterable
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


class LinkedList<E> implements Iterable<E> {

    private Node head;
    private Node tail;

    public void add(E data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E data = current.getData();
                current = current.getNext();
                return data;
            }
        };
    }

    //..

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

public class App {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>(); // dynamic array
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        HashSet<String> set = new HashSet<>(); // hash table
//        set.add("A");
//        set.add("B");
//        set.add("C");
//
//        // client-code
//       Iterator<String> it= set.iterator();
//       while (it.hasNext()){
//           System.out.println(it.next());
//       }


        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        for(String data : list){
            System.out.println(data);
        }


    }
}
