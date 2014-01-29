public class PersonPointer {/*implements PersonQueue{
    
    this is a class that eas meant to implement personQueue, but i couldnt get it to work.
    */

/**The head of the stack: the visible node
 * 
 */
    private PersonPointer lastItem;
    private StringStackNode head;
    
    public void PersonPointer(){
    head = null;
    }
    
    public void push(String newPerson){
    StringStackNode newPersonNode = new StringStackNode(newPerson);
    if (head!= null){// if there is a place in memory stored for the StringStackNodeObject already...
    newPersonNode.setNext(head);
    }
    head = newPersonNode;
    }
  
    public String pop(){
    if (head == null) {
    return null;
    }
    String temp = head.getText();
    head = head.getNext();
    return temp;
    }
    
    public String peek(){
    if (head == null) {
    return null;
    }
    else {
    return head.getText();
    }
    }
    
    public boolean isEmpty(){
    if (getSize() == 0){
    return true;
    }else{
    return false;
    }   
    }
    
    public int getSize(){
    int counter = 0;
    StringStackNode current = head;
    while(current!=null){
    current = current.getNext();
    counter++;
    }
    return counter;
    }
    
    public PersonPointer retrieve(){
    return this.lastItem;
    }
    
    public void insert(PersonPointer person){
    this.lastItem = person;
    }


}