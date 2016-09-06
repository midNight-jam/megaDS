package com.darkRealm.ArrayList;

import java.util.Arrays;

/**
 * Created by Jayam on 9/5/2016.
 */
public class ArrayList <E> {

    private int _size;
    private static final int _capacity = 2;
    private E[] _elements;

    public ArrayList() {
        _size = 0;
        _elements = (E[]) new Object[_capacity];
    }

    public void add(E e) {
        if (_size == _elements.length) {
            expandStorage();
        }
        _elements[_size] = e;
        _size++;
    }

    private void expandStorage() {
        int expanededSize = 2 * _size;
        _elements = Arrays.copyOf(_elements, expanededSize);
    }
}
