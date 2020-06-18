/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.act1.lubao;

/**
 *
 * @author Jeo
 */
public class SList<E> {

    private SNode<E> head, tail;
    private int size;

    //Constructor to create list
    public SList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public SNode first() {
        return head;
    }

    public SNode last() {
        return tail;
    }

    public void addFirst(SNode newNode) {
        newNode.setNext(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNext(tail);
        }
        size++;
    }

    //Activity for June 18
    public void addLast(SNode newNode) {
        tail.setNext(newNode);
        tail = newNode;
        if (isEmpty()) { //similar to the addFirst() method, however, since it is in the tail side, we just swap the values as seen in lines 40-41/ 
            head = newNode; //set tail ->head
            tail.setNext(head); //swap values of head and tail
        }
        size++;
    }
    
    //Activity for June 18
    public SNode removeFirst(){
        SNode<E> tempNode = head;
        head = head.getNext();
        tempNode.setNext(head); //instead of setting tempNode.setNext() value to null, change the tempNode as head
        size--;
        return tempNode;
    }

    public void showList() {
       
        SNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print("[" + temp.getElement() + "]");
            temp = temp.getNext();
        }
        
        System.out.println("\nFirst Node Element: "  + first().getElement()); //displays List Head
        System.out.println("Last Node Element: "  + last().getElement()); // displays List Tail
    }
}
