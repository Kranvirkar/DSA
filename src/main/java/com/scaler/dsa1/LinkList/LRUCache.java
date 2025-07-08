package com.scaler.dsa1.LinkList;

import java.util.HashMap;

public class LRUCache {

    private HashMap<Integer, LRUNode> map;
    private int capacity, count;
    private LRUNode head, tail;

    public LRUCache(int capacity)
    {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new LRUNode(0, 0);
        tail = new LRUNode(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }

    public void deleteLRUNode(LRUNode LRUNode)
    {
        LRUNode.pre.next = LRUNode.next;
        LRUNode.next.pre = LRUNode.pre;
    }

    public void addToHead(LRUNode LRUNode)
    {
        LRUNode.next = head.next;
        LRUNode.next.pre = LRUNode;
        LRUNode.pre = head;
        head.next = LRUNode;
    }

    public int get(int key)
    {
        if (map.get(key) != null) {
            LRUNode LRUNode = map.get(key);
            int result = LRUNode.value;
            deleteLRUNode(LRUNode);
            addToHead(LRUNode);
            System.out.println("Got the value : " + result
                    + " for the key: " + key);
            return result;
        }
        System.out.println("Did not get any value"
                + " for the key: " + key);
        return -1;
    }

    public void set(int key, int value)
    {
        System.out.println("Going to set the (key, "
                + "value) : (" + key + ", "
                + value + ")");
        if (map.get(key) != null) {
            LRUNode LRUNode = map.get(key);
            LRUNode.value = value;
            deleteLRUNode(LRUNode);
            addToHead(LRUNode);
        }
        else {
            LRUNode LRUNode = new LRUNode(key, value);
            map.put(key, LRUNode);
            if (count < capacity) {
                count++;
                addToHead(LRUNode);
            }
            else {
                map.remove(tail.pre.key);
                deleteLRUNode(tail.pre);
                addToHead(LRUNode);
            }
        }
    }
}

