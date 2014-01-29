/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class HashTableMap {
    
    String[][] myHashTable = new String[100][100];
    
    //fill array to null
    public void fillcells(){
        for (int i = 0; i<100; i++){
    for ( int j = 0; j<100; j++){ 
    myHashTable[i][j] = null;
    }
}
}

    
    public String put(int key, String name){
        if (key<100 && myHashTable[key][0] == null){
            myHashTable[key][0] = name;
        }
            
        
        myHashTable = myHashTable[key][name];
    }
    
}
