package com.darkRealm.Graph;

import com.darkRealm.Stack.Stack;

/**
 * Created by Jayam on 8/26/2016.
 */
public class Graph implements IGraph {
    int[][] _adjacencyMatrix;
    int _noOfVertices;
    Vertex[] _vertices;

    public Graph(int[][] adjacency) {
        _adjacencyMatrix = adjacency;
        _noOfVertices = adjacency[0].length;
        _vertices = new Vertex[_noOfVertices];
        Vertex v;
        for (int i = 0; i < _noOfVertices; i++) {
            v = new Vertex(i);
            v._vertexNo = i;
            v.status = Status.NotProcessed;
            _vertices[i] = v;
        }
    }

    @Override
    public void doDepthFirst() {
        //push first vertex in stack & make its status as pushed
        Vertex vertex = _vertices[0];
        vertex.status = Status.Pushed;
        Stack stack = new Stack(_noOfVertices);
        stack.push(vertex);
        //now pop the top element & make its stauc as processed,
        while (!stack.isEmpty()) {
            vertex = (Vertex) stack.pop();
            vertex.status = Status.Processed;
            // this poped vertex is the vertex as per the DFS
            System.out.println(vertex._vertexNo);
            for (int i = 0; i < _noOfVertices; i++) {
                // as you pop the vertex push the next adjacent/reachable vertex in the stack & mark its status as pushed
                if ((_adjacencyMatrix[vertex._vertexNo][i] == 1) && _vertices[i].status == Status.NotProcessed) {
                    Vertex v2 = _vertices[i];
                    v2.status = Status.Pushed;
                    stack.push(v2);
//                    break;
                }
            }
        }
    }

    @Override
    public void doBreadthFirst() {

    }
}