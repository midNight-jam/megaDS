package com.darkRealm.Graph;

import com.darkRealm.Queue.IQueueElement;
import com.darkRealm.Stack.IStackElement;

/**
 * Created by Jayam on 8/26/2016.
 */
public class Vertex implements IStackElement, IQueueElement {
    int _vertexNo;
    Status status;

    Vertex(int n) {
        _vertexNo = n;
    }

    @Override
    public Object getData() {
        return _vertexNo;
    }
}