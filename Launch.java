public class Launch{
        LinkedList listStart = null;


public void launch(){


    
    LinkedList myList1 = new LinkedList("Esha", 27, "reading");
    //System.out.println(myList1.getHead());
    //System.out.println(myList1);
    listStart = myList1;
    
    
    //listStart.firstPatient(myList1);
    //myList1.printElement();
    
   LinkedList myList2 = new LinkedList("Manoj", 26, "packaging");
    listStart.addFirstCirclePatient(myList2);
    //myList2.printElement();

   LinkedList myList3 = new LinkedList("Raju", 35, "driving");
    listStart.addFirstCirclePatient(myList3);
    //myList3.printElement();
    
   /* LinkedList myList4 = new LinkedList("Mom", 60, "clothes");
    listStart.addFirstCirclePatient(myList4);
    //myList4.printElement();
    
    LinkedList myList5 = new LinkedList("Dad", 65, "carpet");
    listStart.addFirstCirclePatient(myList5);
    
    //myList5.printElement();*/
   
myList1.printElement();
myList2.printElement();
myList3.printElement();
//myList4.printElement();
//myList5.printElement();
}
     
    public boolean isEmpty(){
    if (listStart != null){
        return false;
    }
    else return true;
    }
    
}