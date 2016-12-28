package com.darkRealm.BST;

/**
 * Created by Jayam on 8/21/2016.
 */
public class IntTreeElement implements ITreeElement {
    IntTreeElement _left;
    IntTreeElement _right;
    int _data;

    public int get_data() {
        return _data;
    }

    public IntTreeElement(int d) {
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
    public void setData(int data) {
        _data = data;
    }

    @Override
    public boolean isLeaf() {
        return getLeft() == null && getRight() == null;
    }
}
