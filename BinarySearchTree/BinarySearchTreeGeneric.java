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
    public void delete(ITreeElement node) {
        if (!isEmpty()) {
            deleteElement(null, _root, node);
        }
    }

    private void deleteElement(ITreeElement par,ITreeElement current, ITreeElement node) {
        //Data found, perform deletion...
        if (current.getData() == node.getData()) {
            //  Only one child
//            if (current.getData() == _root.getData()) {//Single Element
//                _root = null;
//            }
            if (current.isLeaf()) {
                if (current.getData() < par.getData()) {
                    par.setLeft(null);
                    return;
                } else {
                    par.setRight(null);
                    return;
                }
            }
            // Only LEFT child
            if (current.getLeft() != null && current.getRight() == null) {
                if (current.getData() < par.getData()) {
                    par.setLeft(current.getLeft());
                    return;
                } else {
                    par.setRight(current.getLeft());
                }
            }
            // only Right child
            if (current.getLeft() == null && current.getRight() != null) {
                if (current.getData() < par.getData()) {
                    par.setLeft(current.getRight());
                    return;
                } else {
                    par.setRight(current.getRight());
                }
            }
            // Two Childs, find the left most data in the right side to replace with the deleting node.
            else {
                ITreeElement tempPar = current;
                ITreeElement temp = current.getRight();
                while (temp.getLeft() != null) {
                    tempPar = temp;
                    temp = temp.getLeft();
                }
                //update current, with left most
                current.setData(temp.getData());
                // update the pointers of the actual delting node
                if (temp.isLeaf()) {
                    tempPar.setLeft(null);
                    return;
                } else {
                    tempPar.setLeft(temp.getRight());
                    return;
                }
            }
        }
        // find data recursively...
        if (node.getData() < current.getData()) {
            deleteElement(current, current.getLeft(), node);
        } else {
            deleteElement(current, current.getRight(), node);
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