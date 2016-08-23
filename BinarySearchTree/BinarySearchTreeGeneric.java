package com.darkRealm.BST;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Jayam on 8/22/2016.
 */
public class BinarySearchTreeGeneric <E extends ITreeElement> implements IBinarySearchTree {

    E _root;
    int _height;

    public BinarySearchTreeGeneric() {
        _root = null;
    }

    @Override
    public boolean isEmpty() {
        return _root == null;
    }

    @Override
    public int getHeight() {
        return _height;
    }

    // Pretty Print is incomplete & needs to be tuned up!!
    @Override
    public void prettyPrintLevelOrder() {
        Queue queue = new LinkedList<ITreeElement>();
        if (!isEmpty()) {
            queue.add(_root);
            ITreeElement element, leftELement, rightElement;
            while (!queue.isEmpty()) {
                element = (ITreeElement) queue.remove();
                leftELement = element.getLeft();
                rightElement = element.getRight();
                if (leftELement != null)
                    queue.add(leftELement);
                if (rightElement != null)
                    queue.add(rightElement);
                System.out.print(" " + element.getData());
            }
        }
    }

    @Override
    public void printInorder() {
        if (!isEmpty()) {
            printInorderNode(_root);
        }
    }

    private void printInorderNode(ITreeElement node) {
        if (node != null) {
            printInorderNode(node.getLeft());
            System.out.print(" " + node.getData());
            printInorderNode(node.getRight());
        }
    }

    @Override
    public void insert(ITreeElement node) {
        if (_root == null) {    // First element
            _root = (E) node;
            _height++;
            return;
        }
        insertChild(_root, node);
    }

    private void insertChild(ITreeElement par, ITreeElement node) {
        if (node.getData() < par.getData()) {
            if (par.getLeft() == null) {
                if (par.isLeaf())
                    setHeight(_height + 1);
                par.setLeft(node);
                return;
            }
            insertChild(par.getLeft(), node);   //Smaller than Parent
        } else {
            if (par.getRight() == null) {
                if (par.isLeaf())
                    setHeight(_height + 1);
                par.setRight(node);
                return;
            }
            insertChild(par.getRight(), node);  //Equal or greater than Parent
        }
    }

    private void setHeight(int h) {
        _height = h;
    }
}