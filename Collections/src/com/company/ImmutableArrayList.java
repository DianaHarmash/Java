package com.company;

import java.util.*;

public class ImmutableArrayList<T> extends AbstractList implements Iterator<Object> {
    private int capacity = 10;
    private int sizeOfList = 0;
    private Object[] elements;
    private int size;

    public ImmutableArrayList() {
        elements = new Object[capacity];
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

    public ImmutableArrayList(Collection<T> collection) {
        elements = Arrays.copyOf(new Collection[]{collection}, collection.size() + 4);
    }

    public ImmutableArrayList(int capacity) {
        elements = new Object[capacity];
        this.capacity = capacity;
    }

    public void getNewCapacity() {
        if (this.sizeOfList >= this.capacity - 4) {
            this.elements = Arrays.copyOf(this.elements, this.capacity + 4);
            this.capacity = this.capacity + 4;
        }
    }

    @Override
    public boolean add(Object ob) {
        getNewCapacity();
        this.elements[this.sizeOfList++] = ob;
        return true;
    }

    public void add(Object ob, int index) {
        if (index < 0) throw new IllegalStateException();
        getNewCapacity();
        if (index >= this.elements.length + 1) {
            index = this.elements.length;
            this.elements[index] = ob;
        } else {
            int x;
            Object[] n1 = new Object[index+1];
            Object[] n2 = new Object[this.sizeOfList - index];
            System.arraycopy(this.elements, 0, n1, 0, index+1);
            n1[index] = ob;
            System.arraycopy(this.elements, index, n2, 0, this.sizeOfList- index);
            System.arraycopy(n1, 0, this.elements, 0, index+1);
            System.arraycopy(n2, 0, this.elements, index+1, this.sizeOfList - index);
        }
        this.sizeOfList++;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= this.elements.length) throw new IllegalStateException();
        return this.elements[index];
    }

    @Override
    public boolean remove(Object ob) {
        return false;
    }

    int x = 0;
    @Override
    public boolean hasNext() {
        if (x >= this.elements.length) {
            x = 0;
            return false;
        } else if (this.elements[x] != null) {
            x++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return this.elements[x-1];
        }
        return null;
    }
}
