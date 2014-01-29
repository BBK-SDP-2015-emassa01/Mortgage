/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Map implements SimpleMap {
    
  
    int key = 0;
    String toEnter;
    Map next;
    Map head;
    
    public Map(){
       
    }

    public Map(int key, String name)
    {
        this.key = key;
        this.toEnter = name;
        this.next = null;
        this.head = null;
        
        System.out.println(key +": key "+ toEnter +": Name");
    key++;
    }   
    
    public Map(String name){
        this.toEnter = name;
    }
    
        public Map(int key){
        this.key = key;
    }
    
   
public void put(int key, String name){
this.toEnter = name;
this.key = key;
}


/* Returns the name associated with that key,
* or null if there is none.
*/
public String get(int key){
    if (this.key == key){
        return toEnter;}
        else {return get(key);
                }
                }
       

/**
* Removes a name from the map. Future calls to get(key)
* will return null for this key unless another
* name is added with the same key.
*/
public void remove(int key){
    if (this.key == key){
        System.out.println (this.key + ":key.");
        this.toEnter = null;
    }
        else {this.next.remove(key);
    }
}
               



/**
* Returns true if there are no workers in the map,
* false otherwise
*/

public boolean isEmpty(){
    if (this.head == null){
return true;
} else {return false;
}

}
}

