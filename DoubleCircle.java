/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class DoubleCircle {
    
    public static void main(String[] args){
        DoubleLinkedList Esha = null;
        DoubleLinkedList Manoj = null;
        
        DoubleLinkedList newCircleDoubleList = new DoubleLinkedList(Esha, 27);
        newCircleDoubleList.printElement();
        
        DoubleLinkedList CircleDoubleList = new DoubleLinkedList(Manoj, 26);
        newCircleDoubleList.AddFirstDoubleLinkedList(CircleDoubleList);
        
        newCircleDoubleList.printElement();
        CircleDoubleList.printElement();
    
    
    
    }
    
}
