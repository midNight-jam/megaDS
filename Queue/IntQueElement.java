package com.darkRealm.Queue;

/**
 * Created by Jayam on 8/28/2016.
 */
public class IntQueElement implements IQueueElement {

    int _data;

    public IntQueElement(int n) {
        _data = n;
    }

    @Override
    public Object getData() {
        return _data;
    }
}
