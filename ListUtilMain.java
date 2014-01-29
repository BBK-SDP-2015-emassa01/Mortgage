public class ListUtilMain{
    
    public static void main(String[] args){
    
    //int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] a = {5, 3, 4,6, 6, 7, 2};
    
    
        ListUtilities myArrayList = new ListUtilities();

        int[] b = myArrayList.sortArray(a);

        for(int i= 0; i<b.length;i++){
            int toAdd = b[i];
        
            ListUtilities tempObject = new ListUtilities(toAdd);
        
            myArrayList.add(tempObject);
        
    
            System.out.println("to add: "+toAdd);
        
            System.out.println(tempObject.geta());
            System.out.println(tempObject);
            System.out.println(tempObject.getThisNext());
        }
    }
}

    /**ListUtilities myArrayList = new ListUtilities();
    myArrayList.addArrayElement(a);
    * */
        
    
