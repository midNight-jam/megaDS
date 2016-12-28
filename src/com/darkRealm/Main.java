package com.darkRealm;

import com.darkRealm.ArrayList.ArrayList;
import com.darkRealm.BST.BinarySearchTreeGeneric;
import com.darkRealm.BST.ITreeElement;
import com.darkRealm.BST.IntTreeElement;
import com.darkRealm.Graph.Graph;
import com.darkRealm.HashMap.MyHashMap;
import com.darkRealm.Heap.Heap;
import com.darkRealm.Queue.IntQueElement;
import com.darkRealm.Queue.Queue;
import com.darkRealm.SinglyLinkedList.SinglyLinkedList;
import com.darkRealm.Stack.Stack;
import com.darkRealm.StringBuilder.JStringBuilder;
import com.darkRealm.Trie.Trie;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // write your code here
//        doGraph();
//        doStack();
//        doQueue();
//        doArrayList();
//        doTrie();
//            BST();
//        doStringBuilder();
//    doLinkedList();
//    doSortByKey_Values();
    doHeap();
  }

  public static void doTrie() {
    Trie trie = new Trie();
    trie.insert("ace");
    trie.insert("acer");
    trie.insert("act");
    boolean res = trie.search("acer");
    System.out.println("searching act in trie : " + res);
    System.out.println("searching acv in trie : " + trie.search("acv"));
    System.out.println("Printing trie : ");
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
    System.out.println("");
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

  public static void doArrayList() {
    ArrayList arrayList = new ArrayList<Character>();
    arrayList.add('a');
    arrayList.add('b');
    arrayList.add('c');
    arrayList.add('d');
  }

  public static void doStringBuilder() {

        /*char [] s1 = "abc".toCharArray();
        char [] s2 = new char[6];

        System.arraycopy(s1,0,s2,0,3);
        s2.toString();*/
    StringBuilder s = new StringBuilder();
//        //s.append("a");
    //StringBuilder sb = new StringBuilder();
    //sb.append("abc");
    //sb.append("123456");

  }

  public static void doLinkedList() {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.insert(23);
    sll.insert(11);
    sll.insert(23);
    sll.insert(11);
    sll.insert(13);
    sll.traverse();
  }

  public static void doSortByKey_Values() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("aaa", 10);
    map.put("bbb", 30);
    map.put("ccc", 5);
    map.put("ddd", 15);
    map.put("eee", 20);
    MyHashMap.doSortByValues(map);
  }

  public static void doHeap() {
    Heap heap = new Heap(5);
    heap.insert(3);
    heap.insert(6);
    heap.insert(4);
    heap.insert(5);
    heap.insert(1);
    while (!heap.isEmpty()) {
      System.out.print(heap.fetchTop()+" ");
    }
  }
}