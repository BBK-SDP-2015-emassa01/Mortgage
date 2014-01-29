public class StringStackNode{
private String content;
private StringStackNode next;

public StringStackNode(String text){
content = text;
next = null;
}

public String getText(){
return content;
}

public void setNext(StringStackNode givenNode){
    this.next = givenNode;
}

public StringStackNode getNext(){
return next;
}
/**
 * public void testSetNext(){
 * System.out.println("setNext");
 * 
 * StringStackNode instance = new StringStackNode("Daddy");
 * StringStackNode start = instance;
 * 
 * StringStackNode instance1 = new StringStackNode("Manoj");
 * start.setNext(instance1);
 * 
 * StringStackNode instance2 = new StringStackNode("Raju");
 * start.setNext(instance2);
 * 
 * StringStackNode instance3 = new StringStackNode("Mummy");
 * start.setNext(instance3);
 *
 * }
 * @return 
 */



}