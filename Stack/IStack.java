package com.darkRealm.Stack;

/**
 * Created by Jayam on 8/26/2016.
 */
public interface IStack {
    IStackElement peek();

    void push(IStackElement e);

    IStackElement pop();

    boolean isEmpty();
}
