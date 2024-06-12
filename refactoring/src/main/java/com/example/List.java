package com.example;

import java.util.function.Consumer;

public interface List {

    void add(Object element);

    void remove(Object element);

    Object get(int index);

    int size();

    boolean isEmpty();

    void clear();

    boolean contains(Object element);

    int indexOf(Object element);

    int lastIndexOf(Object element);

    Object[] toArray();

    void addAll(List list);

    void addAll(int index, List list);

    void removeAll(List list);

    void retainAll(List list);

    void replaceAll(Object oldElement, Object newElement);

    void sort();

    void reverse();

    void shuffle();

    void swap(int index1, int index2);

    void rotate(int distance);

    void fill(Object element);

    void fill(int fromIndex, int toIndex, Object element);

    void copy(List list);

    void copy(int fromIndex, int toIndex, List list);

    void partition(int index, List list);

    void merge(List list1, List list2);

    void split(int index, List list);

    void clear(int fromIndex, int toIndex);

    void remove(int fromIndex, int toIndex);

    void removeIf(Object element);

    void removeIf(int fromIndex, int toIndex, Object element);


    void replaceAll(int fromIndex, int toIndex, Object oldElement, Object newElement);

    void replaceAll(List list);

    void replaceAll(int fromIndex, int toIndex, List list);

    void replaceAll(int fromIndex, int toIndex, List list, int fromIndex2, int toIndex2);

    void replaceAll(int fromIndex, int toIndex, List list, int fromIndex2, int toIndex2, int fromIndex3, int toIndex3);

    void replaceAll(int fromIndex, int toIndex, List list, int fromIndex2, int toIndex2, int fromIndex3, int toIndex3, int fromIndex4, int toIndex4);

    void replaceAll(int fromIndex, int toIndex, List list, int fromIndex2, int toIndex2, int fromIndex3, int toIndex3, int fromIndex4, int toIndex4, int fromIndex5, int toIndex5);

    //void forEach(Consumer<Object> action);

    default void forEach(Consumer<Object> action) {
        for (int i = 0; i < size(); i++) {
            action.accept(get(i));
        }
    }

}
