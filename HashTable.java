/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public interface HashTable {
    /**
* Map from integer to Strings: one to many
*/

/* Puts a new String in the map.
*/
String put(int key, String name);
/**
* Returns all the names associated with that key,
* or null if there is none.
*/
String[] get(int key);
/**
* Removes a name from the map.
*/
void remove(int key, String name);
/**
* Returns true if there are no workers in the map,
* false otherwise
*/
boolean isEmpty();
}


