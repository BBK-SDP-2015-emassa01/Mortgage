public class ListUtilities{
    
    private  int a;
    private  ListUtilities next;
    
    //private  ListUtilities[] myList;
    
    public ListUtilities(){
        this.a = 0;
        this.next = null;
    
    }

    public ListUtilities(int a ){
        this.a = a;
        this.next = null;
    
    }

    public ListUtilities getThisNext(){
    return this.next;
    }
    
    public int geta(){
    return this.a;
    }

    public void add(ListUtilities a){
    if (this.next == null){
    this.next = a;
    } else {
    this.next.add(a);
    }
    }
    
    public ListUtilities addArrayElement(int[] a){
   // ListUtilities myList = new ListUtilities();
    for(int i = 0; i <a.length; i++){
    int toAdd = a[i];
    ListUtilities tempObject = new ListUtilities(toAdd);
    this.add(tempObject);
    System.out.println("my int is: "+ this.a + " and my next is: " + this.next);
    }
    return this;
    }
    
    public int[] sortArray(int[] a){
        
        for(int i= 0; i<a.length;i++){
        
        for (int j = i+1; j<a.length; j++){
        if(a[i] >a[j]){
          a[i] = a[j];
          i=j;
             
           // int temp = a[j];
           // a[j] = a[i];
           // a[i] = temp;
        //i = j;}
        }
  
    }
    }  
    for (int k = 0; k< a.length; k++){
    System.out.println(a[k]);}
    return a;
    }

}


