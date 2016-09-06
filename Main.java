package com.darkRealm;

import com.darkRealm.ArrayList.ArrayList;
import com.darkRealm.BST.BinarySearchTreeGeneric;
import com.darkRealm.BST.ITreeElement;
import com.darkRealm.BST.IntTreeElement;
import com.darkRealm.Graph.Graph;
import com.darkRealm.Queue.IntQueElement;
import com.darkRealm.Queue.Queue;
import com.darkRealm.Stack.Stack;
import com.darkRealm.Trie.Trie;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        doGraph();
//        doStack();
//        doQueue();
//        doArrayList();
        doTrie();
    }


    public static void doTrie() {
        Trie trie = new Trie();
        trie.insert("ace");
        trie.insert("acer");
        trie.insert("act");
        boolean res = trie.search("acer");
        System.out.println("searching act in trie : "+res);
        System.out.println("searching acv in trie : "+trie.search("acv"));
        System.out.println("Printing trie : " );
        trie.doPrint();

    }

    public static void BST() {
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

    public static void doGraph() {
        int[][] adjacencyMatrix = new int[][]{
                {0, 1, 1, 0, 0, 0, 0},//0
                {1, 0, 0, 1, 1, 0, 0},//1
                {1, 0, 0, 0, 0, 1, 0},//2
                {0, 1, 0, 0, 0, 0, 0},//3
                {0, 1, 0, 0, 0, 0, 0},//4
                {0, 0, 1, 0, 0, 0, 1},//5
                {0, 0, 0, 0, 0, 1, 0},//6
        };

        Graph graph = new Graph(adjacencyMatrix);
        System.out.println("Depth First Traversal...");
        graph.doDepthFirstTraversal();
        System.out.println("Breadth First Traversal...");
        graph.doBreadthFirstTraversal();
    }

    public static void doStack() {
        Stack st = new Stack(2);
        System.out.println("is empty " + st.isEmpty());
        System.out.println("peek" + st.peek());
//        st.push(11);
//        st.push(22);
        System.out.println("peek" + st.peek());
        System.out.println("pop  " + st.pop());
        System.out.println("is empty " + st.isEmpty());
        System.out.println("peek" + st.peek());
        System.out.println("pop  " + st.pop());
        System.out.println("is empty " + st.isEmpty());
        System.out.println("peek" + st.peek());
    }

    public static void doQueue() {
        Queue que = new Queue(5);
//        que.showQue();
        que.insert(new IntQueElement(11));
        que.insert(new IntQueElement(22));
        que.showQue();
        System.out.println(" front - " + que.remove().getData());

        System.out.println(" After first removal");
        que.showQue();
        System.out.println(" front - " + que.remove().getData());
        System.out.println(" After Second removal");
        que.showQue();
        System.out.println(" front - " + que.remove());
        que.showQue();
        System.out.println(" full ");

        que.insert(new IntQueElement(33));
        que.insert(new IntQueElement(44));
        que.insert(new IntQueElement(55));
        que.insert(new IntQueElement(66));
        que.insert(new IntQueElement(77));
        que.showQue();
    }

    public static void doArrayList(){
        ArrayList arrayList = new ArrayList<Character>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
    }
}

