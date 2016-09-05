package com.darkRealm;

/**
 * Created by jayam on 9/4/16.
 */
public class IntHeapElement implements IHeapElement {

    int _data;

    IntHeapElement(int data) {
        _data = data;
    }

    @Override
    public int getData() {
        return _data;
    }

    @Override
    public String toString() {
        return " " + getData();
    }
}