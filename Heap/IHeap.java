package com.darkRealm;

/**
 * Created by jayam on 9/4/16.
 */
public interface IHeap {
    void insert(IHeapElement ele);

    IHeapElement delete();

    IHeapElement[] heapSort();

    boolean isEmpty();
}