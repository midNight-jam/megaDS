package com.darkRealm.BST;

/**
 * Created by Jayam on 8/21/2016.
 */
public interface ITreeElement {
    ITreeElement getRight();

    ITreeElement getLeft();

    void setRight(ITreeElement e);

    void setLeft(ITreeElement e);

    int getData();

    void setData(int data);

    boolean isLeaf();
}