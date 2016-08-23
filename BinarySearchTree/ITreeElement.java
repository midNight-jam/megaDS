package com.darkRealm.BST;

/**
 * Created by Jayam on 8/21/2016.
 */
public interface ITreeElement {
    public ITreeElement getRight();
    public ITreeElement getLeft();
    public void setRight(ITreeElement e);
    public void setLeft(ITreeElement e);
    public int getData();
    public boolean isLeaf();
}
