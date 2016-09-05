package com.darkRealm;

public class Main {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(6);
        heap.insert(new IntHeapElement(11));
        heap.insert(new IntHeapElement(22));
        heap.insert(new IntHeapElement(33));
        heap.insert(new IntHeapElement(44));
        heap.insert(new IntHeapElement(55));
        heap.insert(new IntHeapElement(66));

        System.out.println(heap);
        heap.delete();
        System.out.println(heap);
        heap.insert(new IntHeapElement(77));
        IHeapElement[] sortedOutPut = heap.heapSort();
        System.out.println(heap);

        for (int i = 0; i < sortedOutPut.length; i++) {
            System.out.print(" " + sortedOutPut[i].getData());
        }
    }
}
