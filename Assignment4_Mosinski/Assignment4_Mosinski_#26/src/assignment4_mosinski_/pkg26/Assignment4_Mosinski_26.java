/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_mosinski_.pkg26;

/**
 *
 * @author nmosinski
 */
public class Assignment4_Mosinski_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinglyLinkedListImpl<Integer> singlyLinkedList = new SinglyLinkedListImpl<Integer>();
        
        singlyLinkedList.add(27);
        singlyLinkedList.add(99);
        singlyLinkedList.add(76);
        singlyLinkedList.add(34);
        
        singlyLinkedList.addAfter(57, 76);
        
        singlyLinkedList.deleteFront();
        
        singlyLinkedList.deleteAfter(57);
        
        singlyLinkedList.traverse();                              
    }
    
}
