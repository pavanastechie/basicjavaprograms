package com.datastructures;

/**
 * Created by devup on 06/09/16.
 */
public class LinkedList {
    public Node head;
    public Node tail;
    public int count;

    public LinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean addItemAtFirst(Object val) {
        Node newNode = new Node(val);
        if (head != null) {
            newNode.setNext(head);
            head = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
        count++;
        return true;
    }

    public boolean addItem(Object val) {
        Node newNode = new Node(val);
        if (tail != null) {
            tail.setNext(newNode);
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
        count++;
        return true;
    }

    public boolean addItemAtPos(Object val, int pos) {
        Node newNode = new Node(val);
        Node temp = head;
        int initCount = 1;
        if (count > pos) {
            while (initCount < count) {
                if (pos == 0) {
                    addItemAtFirst(val);
                    break;
                } else if (initCount == pos) {
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                    break;
                } else if (pos >= count) {
                    addItem(val);
                }
                temp = temp.getNext();
                initCount++;
            }
        } else {
            System.out.println("Position not found, LinkedList size is '" + (count - 1) + "' but position you want to insert is '" + pos+"'");
        }
        count++;
        return true;
    }

    public boolean removeFirst() {

        head = head.getNext();

        count--;
        return true;
    }

    public boolean removeLast() {

        int initCount = 1;
        Node temp = head;
        while (initCount < count) {
            if(initCount == count -1){
                temp.setNext(null);
                tail = temp;
            }
            temp = temp.getNext();
            initCount++;
        }
        count--;
        return true;
    }

    public boolean removeEleAtPos(int pos) {
        Node prevEle = null;
        Node currentEle = null;;
        Node temp = head;
        int initCount = 1;
        if(count > pos) {
            while(initCount < count) {
                if (pos == 0) {
                removeFirst();
                } else if (initCount == pos) {
                    prevEle = temp;
                }
                else if(initCount == pos){
                    currentEle = temp;
                    System.out.println(prevEle.getValue()+"  "+currentEle.getValue()+"  "+count);
                }else if (pos >= count) {
                    removeLast();
                }
                initCount ++;
                temp = temp.getNext();
            }
        }else{
            System.out.println("Position not found, LinkedList size is '" + (count - 1) + "' but position you want to insert is '" + pos+"'");
        }

        count --;
        return true;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + "===>");
            temp = temp.getNext();

        }
    }


}
