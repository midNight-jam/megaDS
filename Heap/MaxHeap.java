package com.darkRealm;

/**
 * Created by Jayam on 9/4/16.
 *
 * Array representation of Tree
 * Parent n == will have childs at 2n+1 & 2n+2
 * Children n == will have its parent at int rounded down (n-1)/2
 */
public class MaxHeap implements IHeap {

    private int _heapCounter;
    private IHeapElement[] _heap;

    MaxHeap(int size) {
        _heapCounter = 0;
        _heap = new IHeapElement[size + 1];
    }

    @Override
    public String toString() {
        System.out.println("");
        if (isEmpty()) {
            return "Heap is Empty...";
        }

        String output = "";
        for (int i = 1; i <= _heapCounter; i++) {
            output += _heap[i].getData() + " ";
        }
        return output;
    }

    @Override
    public void insert(IHeapElement element) {
        percolatesUp(element);
    }

    private void percolatesUp(IHeapElement element) {

        // insert the element at the end of heap, & then percolate up
        int pos = ++_heapCounter;

        for (; pos > 1 && _heap[pos / 2].getData() < element.getData(); pos = pos / 2) {
            _heap[pos] = _heap[pos / 2]; // swap the parent down with child, if parent is small & child is bigger,
            //we are doing this because it is a max Heap , so big numbers percolate up
        }
        _heap[pos] = element;
    }

    @Override
    public IHeapElement delete() {
        if (_heapCounter == 0) {
            return null;
        } else {
            return percolateDown();
        }
    }

    @Override
    public IHeapElement[] heapSort() {
        // create a temp array to store the sorted output
        IHeapElement[] sortedOuput = new IHeapElement[_heapCounter];
        int sortedIndex = 0;

        while (_heapCounter > 0) {
            // repeat below till heap size is not empty
            sortedOuput[sortedIndex] = percolateDown();    //pulling out the root, max element
            sortedIndex++;                          // increment sorted index for next bigger element
        }
        return sortedOuput;
    }

    @Override
    public boolean isEmpty() {
        return _heapCounter == 0;
    }

    private IHeapElement percolateDown() {
        int par = 1;
        IHeapElement element = _heap[par];
        _heap[par] = _heap[_heapCounter];    // swapping root with last element
        _heapCounter--;                     // reducing the size of _heap, logical not physical

        IHeapElement temp = _heap[par];

        while (par <= _heapCounter / 2) {
            int child = 2 * par;
            //notice here we are not using _heap.length, bcoz if size =10, _heap will contain 11 elements.
            // thus if we are less than 10, lets say at 9, we still will be able to access both child , i.e 9 & 9+1 = 10
            if (child < _heapCounter && _heap[child].getData() < _heap[child + 1].getData()) {
                // the right child is bigger, so swap it with parent
                child++;
            }
            if (_heap[par].getData() < _heap[child].getData()) {
                // parent is smaller so pull child up
                temp = _heap[par];
                _heap[par] = _heap[child];
            } else {
                break;  // if above both conditions are false, means we are done swapping, cause parents child will
                // lie outside of heap now
            }
            par = child;
        }

        // at this point the small parent has replaces the big child
        _heap[par] = temp;
        return element;
    }
}