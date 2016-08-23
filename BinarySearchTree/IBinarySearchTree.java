package com.darkRealm.BST;

/**
 * Created by Jayam on 8/21/2016.
 */
public interface IBinarySearchTree {

    public void printInorder();
    public void insert(ITreeElement node);
    public boolean isEmpty();
    public int getHeight();
    public void prettyPrintLevelOrder();
}
