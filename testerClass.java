/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class testerClass {
 
    public static void main(String[] args){
        testerClass newMap = new testerClass();
        newMap.launch();
    }
    
    public void launch(){
        
        myMapping world = new myMapping();
        
        world.put(4, "Esha");
        world.put(5, "Manoj");
        world.put(1, "Kailash");
        world.put(2, "Laju");
        world.put(3, "Raju");
        world.put(6, "Tiger");
        world.put(7, "Goldy");
        world.put(8, "Dragon");
        world.put(9, "Terry");
        
        world.put(9, "Terry");
        
        System.out.println(world.get(14));
        
        world.remove(8);
        System.out.println(world.get(8));
        
        System.out.println("Is the mapping empty? ");
        System.out.println(world.isEmpty());
        
        
        
      
        
        
      
        
        
        
    }
}
