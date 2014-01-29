/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class myMapping implements SimpleMap{
    String[] theMap = new String[10000];
    int count = 0;
    
    public void fillCells(){
    for (int i = 0; i<theMap.length; i++){
    theMap[i] = null;}
    }
    
    public void put(int key, String name){
    if (theMap[key] == null){
        theMap[key] = name;
    }else{
        System.out.println("That key is already taken. ");
    }
    }
    
    public String get(int key){
        if (theMap[key] == null){
            return("Not valid or doesn't exist ");    
        } else {
        return theMap[key];
    }
    }
    
    public void remove(int key){
        if (theMap[key]== null){
         System.out.println("Doesn't exist or Already removed.");
        } else
        {
       theMap[key]=null;
        }
    }
    
    public boolean isEmpty(){
        
        for (int i = 0; i <theMap.length;i++){
            if (theMap[i] != null){
                count++;
            }
        }
       if (count>0){
           return false;
       } else {
           return true;
       }
    }
    }
    

