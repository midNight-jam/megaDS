package com.darkRealm.Graph;

import com.darkRealm.Queue.IQueueElement;
import com.darkRealm.Queue.IntQueElement;
import com.darkRealm.Queue.Queue;
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
    public void doDepthFirstTraversal() {
        resetVeterxStatuses(); // reset Statuses
        //push first vertex in stack & make its status as pushed
        Vertex vertex = _vertices[0];
        vertex.status = Status.Pushed;
        Stack stack = new Stack(_noOfVertices);
        stack.push(vertex);
        //now pop the top element & make its stauc as processed,
        while (!stack.isEmpty()) {
            vertex = (Vertex) stack.pop();
            vertex.status = Status.Processed;
            // this poped vertex is the vertex as per the DFS traversal
            System.out.println(vertex._vertexNo);
            for (int i = 0; i < _noOfVertices; i++) {
                // as you pop the vertex,
                // push the next adjacent/reachable notprocessed vertex in the stack & mark its status as pushed
                boolean adjacentVertexButNotProcessed =
                        _adjacencyMatrix[(int) vertex.getData()][i] == 1 && _vertices[i].status == Status.NotProcessed;
                if (adjacentVertexButNotProcessed) {
                    Vertex v2 = _vertices[i];
                    v2.status = Status.Pushed;
                    stack.push(v2);
                }
            }
        }
    }

    @Override
    public void doBreadthFirstTraversal() {
        resetVeterxStatuses();
        Queue queue = new Queue<IntQueElement>(_noOfVertices);
        Vertex vertex = _vertices[0];
        // insert first vertex & make its status as pushed
        vertex.status = Status.Pushed;
        queue.insert(vertex);
        while (!queue.isEmpty()) {
            // this removed vertex is the vertex as per the BFS traversal
            vertex = (Vertex) queue.remove();
            vertex.status = Status.Processed;
            System.out.print(" " + vertex.getData());
            for (int i = 0; i < _noOfVertices; i++) {
                // as you remove the vertex,
                // insert the next adjacent/reachable not processed vertex in the queue & mark its status as pushed
                boolean adjacentVertexButNotProcessed =
                        _adjacencyMatrix[(int) vertex.getData()][i] == 1 && _vertices[i].status == Status.NotProcessed;
                if (adjacentVertexButNotProcessed) {
                    Vertex v2 = _vertices[i];
                    v2.status = Status.Pushed;
                    queue.insert(v2);
                }
            }
        }

    }

    @Override
    public void resetVeterxStatuses() {
        for (int i = 0; i < _noOfVertices; i++) {
            _vertices[i].status = Status.NotProcessed;
        }
    }
}