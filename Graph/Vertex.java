package com.darkRealm.Graph;

import com.darkRealm.Stack.IStackElement;

/**
 * Created by Jayam on 8/26/2016.
 */
public class Vertex implements IStackElement {
    private int _vertexNo;
    Status status;

    Vertex(int n){
        _vertexNo = n;
    }
}

