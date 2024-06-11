package com.example;

public interface List<E> extends Collection<E>{
    E get(int index);
    void set(int index, E element);
    void add(int index, E element);
    void remove(int index);
    int indexOf(E element);
    int lastIndexOf(E element);
    List<E> subList(int fromIndex, int toIndex);
}
