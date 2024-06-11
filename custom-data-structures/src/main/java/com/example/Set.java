package com.example;

public interface Set<E> extends Collection<E>{
    Set<E> union(Set<E> other);
    Set<E> intersection(Set<E> other);
    Set<E> difference(Set<E> other);
    boolean isSubset(Set<E> other);
    boolean isSuperset(Set<E> other);
    boolean equals(Set<E> other);
    Set<E> copy();
    Set<E> newInstance();
}
