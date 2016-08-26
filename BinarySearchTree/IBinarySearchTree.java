package com.darkRealm.BST;

/**
 * Created by Jayam on 8/21/2016.
 */
public interface IBinarySearchTree <E extends ITreeElement > {

    void printInorder();

    void insert(E node);

    boolean isEmpty();

    int getHeight();

    void prettyPrintLevelOrder();

    void delete(E node);
}
