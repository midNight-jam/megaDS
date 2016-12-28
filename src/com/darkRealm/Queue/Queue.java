package com.darkRealm.Queue;

/**
 * Created by Jayam on 8/28/2016.
 */
public class Queue <E extends IQueueElement>implements IQueue {

    int _size;
    int _front, _rear;
    IQueueElement[] _queue;

    public Queue(int n) {
        if (n > 0) {
            _size = n;
            _queue = new IQueueElement[_size];
            _front = _rear = -1;
        }
    }

    @Override
    public IQueueElement remove() {
        if (!isEmpty()) {
            IQueueElement front = _queue[_front];
            if (_front == _rear) {  // if the que has only last element, then we have to reset the front & rear to -1
                _front = _rear = -1;
            } else {
                _front = (_front + 1) % _size; // if the removed element was not the last, then continue to increment mod
            }
            return front;
        }
        return null;
    }

    @Override
    public void insert(IQueueElement e) {
        // when we are inserting the first element, both the front & rear are at same index,
        // after first insertion they will still be at the same index but at 0
        if (_front == -1 && _rear == -1) {
            _front = 0;
            _rear = 0;
            _queue[_rear] = e;
            return;
        }

        // if no removal & only insertion then first case, where front will stay at 0 & rear reaches the end
        // if removal & addition again, but this time que full, then rear will reach one behind the front]
        if ((_front == 0 && _rear == _size - 1) || _front == _rear + 1) {
            System.out.println("Queue Overflow...");
        } else {
            _rear = (_rear + 1) % _size;
            _queue[_rear] = e;
        }
    }

    @Override
    public void showQue() {
        if (!isEmpty()) {
            System.out.print("front | ");
            for (int i = _front; i <= _rear; i++) { // just simple traversal...
                System.out.print((int) _queue[i].getData() + " ");
            }
            System.out.print(" | rear ");

        }
    }

    @Override
    public boolean isEmpty() {
        return _front == -1 && _rear == -1;
    }
}