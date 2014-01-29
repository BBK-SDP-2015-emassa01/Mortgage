public class LinkedList{

    private String name;
    private int age;
    private String hobby;
    private LinkedList forwardLink;
    public LinkedList head;
    
    
public LinkedList(String name, int age, String hobby){
    this.name = name;
    this.age = age;
    this.hobby = hobby;
    this.forwardLink = null;
    

}
public void addFirstCirclePatient(LinkedList newPatient) {
     System.out.println("1this.forwardLink: "+this.forwardLink);
    if (this.head ==null){
    this.head = newPatient;
    //this.forwardLink = newPatient;
    head.forwardLink = head;}
        
    else if (this.forwardLink == null) {
        this.forwardLink = newPatient;
    }
    
    else if (this.forwardLink == head) {
        this.forwardLink = newPatient;
        newPatient.forwardLink = head;
    }
    else{this.forwardLink.addFirstCirclePatient(newPatient);
    
    
        //System.out.println(head);
       System.out.println("1this1: "+this);
        System.out.println("1newPatient: "+ newPatient);
        System.out.println("1head: " +this.head);
        System.out.println("1this.forwardLink: "+this.forwardLink);
        System.out.println("1newpatient.forwardLink: "+newPatient.forwardLink);
        
    //else { 
      //  this.forwardLink.addCirclePatient(newPatient);
    //} 

    } System.out.println("1this.forwardLink: "+this.forwardLink);
}

public void addPatient(LinkedList newPatient) {
 
    if (this.forwardLink == null) {
    // this means this is the last patient in the list 
        this.forwardLink = newPatient;
       //%  newPatient.previousPatient = this;
   
    } else { 
        this.forwardLink.addPatient(newPatient);
    } }


    

/*public void addCirclePatient(LinkedList newPatient) {
    System.out.println(First+ " First | head "+ head );
    
   if (this.forwardLink == First) {
        this.forwardLink = newPatient;
        //newPatient.forwardLink = head;}
        System.out.println("WORKEDDDDD");
    }
    else if (this.head == null) {
        System.out.println("this: "+this);
        System.out.println("newPatient: "+ newPatient);
        System.out.println("head: " + this.head);
        System.out.println("this.forwardLink: "+this.forwardLink);
        System.out.println("newpatient.forwardLink: "+newPatient.forwardLink);
        
        newPatient.forwardLink = this.forwardLink;
        this.forwardLink = newPatient;
        //newPatient.forwardLink = this;
        //newPatient.forwardLink = forwardLink.forwardLink;
    // this means this is the last patient in the list      
    }
 
      else if (this.forwardLink == head) {
    // this means this is the last patient in the list 
        this.forwardLink = newPatient;
        head = newPatient.forwardLink;}
    else { 
        
        this.forwardLink.addCirclePatient(newPatient);
         //newPatient.forwardLink = head;
    }
*/ 

    



/*public void addPatient(Patient newPatient) {
    patientCount++;
    if (this.nextPatient == null) {
    // this means this is the last patient in the list 
        this.nextPatient = newPatient;
       //%  newPatient.previousPatient = this;
   
    } else { 
        this.nextPatient.addPatient(newPatient);
    if (newPatient.forwardLink ==null){
    head = newPatient.forwardLink;
    } */

public LinkedList getHead(){
return this.head;}


public LinkedList getForwardLink(){
return this.forwardLink;
}

public void printElement(){
System.out.print("\t name: "+this.name);
System.out.print("\t age: "+this.age);
System.out.print("\t hobby: "+this.hobby);
System.out.print("\t this.forwardlink: "+this.forwardLink);
System.out.println("\t head: "+head);
}


}
