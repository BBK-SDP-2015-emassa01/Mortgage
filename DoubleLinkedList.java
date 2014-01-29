/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class DoubleLinkedList {
    private int value;
    DoubleLinkedList item;
    DoubleLinkedList head;
    DoubleLinkedList next;
    DoubleLinkedList previous;
    
    public DoubleLinkedList(DoubleLinkedList item, int value){
          this.value = value;
          this.item = item;
    }
     
    public void AddFirstDoubleLinkedList(DoubleLinkedList item){
   
            this.head = item;
            this.next = item;
            this.previous = item;
            
            item.next = this;
            item.previous = this;
            this.printElement();
    }
    
    
    public void AddItemToLinkedList(DoubleLinkedList AnotherItem, int value){
        if (this.next == head){
            AnotherItem.next = this.next;
            AnotherItem.previous = this;
            this.next = AnotherItem;
            head.previous = AnotherItem;
            
            head = AnotherItem;
            this.printElement();
            
        } else {this.next.AddItemToLinkedList(item, value);
        this.printElement();
        
        }
    
    }
    
    public void printElement(){
    System.out.println("\t value: "+this.value);
    System.out.println("\t item: "+this.item);
    System.out.println("\t head: "+this.head);
//    System.out.println("\t this.next: "+this.next);
    System.out.println("\t previous: "+previous);
}
    
}
