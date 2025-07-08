package com.scaler.dsa1.LinkList;

public class LRUNode {
    int key;
    int value;
    LRUNode pre;
    LRUNode next;

    public LRUNode(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}
