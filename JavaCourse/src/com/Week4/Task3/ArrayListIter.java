package com.Week4.Task3;

import java.util.Iterator;
import java.util.NoSuchElementException;
// Task 3
public class ArrayListIter<T> implements Iterator<T> {

    private T[] ar;
    private int index = 0;

    public ArrayListIter (T[] ar){
        this.ar = ar;
    }
    @Override
    public boolean hasNext() {
        return index < ar.length;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return ar[index++];
    }
}
