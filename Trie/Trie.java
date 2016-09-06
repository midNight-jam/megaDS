package com.darkRealm.Trie;

/**
 * Created by Jayam on 9/5/2016.
 */
public class Trie {

    TrieNode _root;

    public Trie() {
        _root = new TrieNode();
    }

    public void insert(String str) {
        str = str.toLowerCase();
        TrieNode trav = _root;
        int indexOfChar = -1;

        // find current char in nodes, if present proceed further if null then add char & move ahead
        int i;
        for (i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            indexOfChar = getIndexForChar(currentChar);

            if (trav._childs[indexOfChar] == null) {    // if encountered null, grow tree from here.
                trav._childs[indexOfChar] = new TrieNode();
            }
            trav = trav._childs[indexOfChar]; // move ahead in path
        }

        // why we are assigning value here, & not at creation of new node.
        // because it could happen that created node was for intermediate traverse, & thats why  after creating whole
        // path, now we are assigning the value.
        if (i == str.length()) {
            trav.setValue(str);
        }
    }

    private int getIndexForChar(char c) {
        return c - 'a';
    }
}