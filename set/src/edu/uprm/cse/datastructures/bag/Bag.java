package edu.uprm.cse.datastructures.bag;

import java.util.List;

public interface Bag<E> {
    public int size();
    
    public boolean isEmpty();
    
    public void add(E e);
    
    public boolean isMember(E e);
    
    public boolean remove(E e);
    
    public int removeAll(E e);
    
    public int count(E e);
    
    public void clear();
    
    public E[] toArray();
    
    public List<Integer> bagAnalizer(Bag<E> B);
}
