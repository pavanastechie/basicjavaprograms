package com.datastructures;

/**
 * Created by devup on 06/09/16.
 */
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList t = new LinkedList();
        t.addItemAtFirst(2);
        t.addItemAtFirst(3);
        t.addItemAtFirst(4);
        t.addItemAtFirst(5);
        t.addItem(1);
        t.addItem(33);
        t.addItemAtPos(22, 3);
        t.removeFirst();
        t.removeLast();
        t.removeEleAtPos(2);
        t.printLinkedList();
    }
}
