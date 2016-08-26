package com.darkRealm;

import com.darkRealm.BST.BinarySearchTreeGeneric;
import com.darkRealm.BST.ITreeElement;
import com.darkRealm.BST.IntTreeElement;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BinarySearchTreeGeneric<IntTreeElement> bst = new BinarySearchTreeGeneric<>();
        ITreeElement arr[] = new IntTreeElement[]{
                new IntTreeElement(100),
                new IntTreeElement(75),
                new IntTreeElement(125),
                new IntTreeElement(50),
                new IntTreeElement(90),
                new IntTreeElement(25),
                new IntTreeElement(110),
                new IntTreeElement(104),
                new IntTreeElement(111),
                new IntTreeElement(105),
                new IntTreeElement(102),
                new IntTreeElement(150),
                new IntTreeElement(135),
                new IntTreeElement(103)
        };

        for (int i = 0; i < arr.length; i++) {
            bst.insert(arr[i]);
        }

        bst.printInorder();
        System.out.println("\nHeight is " + bst.getHeight());

        bst.prettyPrintLevelOrder();
        bst.delete(arr[2]);
        System.out.println("\nAfter 125 delete");
        bst.prettyPrintLevelOrder();


        bst.delete(arr[0]);
        System.out.println("\nAfter 100 delete");
        bst.prettyPrintLevelOrder();
    }
}