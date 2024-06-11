package com.example;

public interface Collection<E> {
    void add(E element) ;
    void remove(E element);
    boolean contains(E element);
    int size();
    boolean isEmpty();
    void clear();
}
