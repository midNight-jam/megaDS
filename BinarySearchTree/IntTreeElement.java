package com.darkRealm.BST;

/**
 * Created by Jayam on 8/21/2016.
 * An example of a Type being the TreeElement, for simplicity this class is having direct data of integer. 
 * More complex classes can have their behaviour & implement the ITreeElement to decide which 
 * part/combination of state to account for data.
 */
public class IntTreeElement implements ITreeElement {
    IntTreeElement _left;
    IntTreeElement _right;
    int _data;

    public int get_data() {
        return _data;
    }

    public IntTreeElement(int d){
        _data = d;
    }

    @Override
    public ITreeElement getRight() {
        return _right;
    }

    @Override
    public ITreeElement getLeft() {
        return _left;
    }

    @Override
    public void setRight(ITreeElement e) {
        _right = (IntTreeElement) e;
    }

    @Override
    public void setLeft(ITreeElement e) {
        _left = (IntTreeElement) e;
    }

    @Override
    public int getData() {
        return _data;
    }

    @Override
    public boolean isLeaf() {
        return getLeft() == null && getRight() == null;
    }
}
