package com.darkRealm.Queue;

/**
 * Created by Jayam on 8/28/2016.
 */
public interface IQueue {
    IQueueElement remove();

    void insert(IQueueElement e);

    void showQue();

    boolean isEmpty();

}
