/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class ListItem {
    int key = 0;
    String toEnter;
    ListItem next;
    ListItem head;

    public ListItem(int key, String name)
    {
        this.key = key;
        this.toEnter = name;
        this.next = null;
        this.head = null;
    }   
    
    public ListItem(String name){
        this.toEnter = name;
    }
    
        public ListItem(int key){
        this.key = key;
    }
    
    
public void add(int key, String name){
if (this.head == null){
this.key++;
}
}

}
