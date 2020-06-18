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
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SNode<String> node1 = new SNode<>("node1", null);
        SNode<String> node2 = new SNode<>("node2", null);
        SNode<String> node3 = new SNode<>("node3", null);
        SNode<String> node4 = new SNode<>("node4", null);
        SNode<String> node5 = new SNode<>("node5", null);
        SNode<String> node6 = new SNode<>("node6", null);
        SList<String> sList = new SList<>();

        sList.addFirst(node1);
        sList.addFirst(node2);
        sList.addFirst(node3);
        sList.addFirst(node4);
        sList.addFirst(node6);//becomes the new head of the SinglyLinkedList, same goes if sList.addLast(node6) but node 6 becomes the new tail
        sList.addLast(node5);

        sList.removeFirst();
        // the list looks like this ==> [node4] -> [node3] -> [node2] -> [node1] -> [node5]
        //                               head                                         tail

        
        // the ORIGINAL list looks like this ==> [node6] -> [node4] -> [node3] -> [node2] -> [node1] -> [node5]
        //                                         head                                                   tail
        
        sList.showList();

    }
}
