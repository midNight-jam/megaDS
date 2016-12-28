package com.darkRealm.Stack;

/**
 * Created by Jayam on 8/26/2016.
 */
public class Stack {
    int _size, _top;
    IStackElement[] arr;

    public Stack(int size) {
        _size = size;
        arr = new IStackElement[_size];
        _top = -1;
    }

    public void push(IStackElement n) {
        if (_top < _size) {
            arr[++_top] = n;

        }
    }

    public boolean isEmpty() {
        return _top == -1;
    }

    public IStackElement peek() {
        if (!isEmpty())
            return arr[_top];
        return null;
    }

    public IStackElement pop() {
        if (_top > -1) {
            IStackElement top = arr[_top];
            _top--;
            return top;
        }
        return null;
    }
}
