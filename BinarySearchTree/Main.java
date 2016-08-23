package com.darkRealm;

import com.darkRealm.BST.BinarySearchTreeGeneric;
import com.darkRealm.BST.ITreeElement;
import com.darkRealm.BST.IntTreeElement;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BinarySearchTreeGeneric<IntTreeElement> bst = new BinarySearchTreeGeneric<>();
        ITreeElement n1, n2, n3, n4;
        n1 = new IntTreeElement(100);
        n2 = new IntTreeElement(75);
        n3 = new IntTreeElement(125);
        n4 = new IntTreeElement(50);

        bst.insert(n1);
        bst.insert(n2);
        bst.insert(n3);
        bst.insert(n4);

        bst.printInorder();
        System.out.println("\nHeight is " + bst.getHeight());

        bst.prettyPrintLevelOrder();
        bst.delete(n4);
        System.out.println("\nAfter 50 delete");
        bst.prettyPrintLevelOrder();
    }
}