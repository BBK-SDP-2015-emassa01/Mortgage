package MyListPackage;

public class MyList
{
    MyNode head;
    
    public MyList()
    {
        head = null;
    }
    
    public void add(MyNode node)
    {
        if(head == null) 
            head = node;
        else
            this.head.add(node);
    }
 
    private void printList(MyNode starter)
    {
       if(starter == null)
            return;
       else
       {
           starter.printNode();
           MyNode temp = starter.getNext();
           this.printList(temp);
       }       
    }
    
    public void print()
    {
        printList(head);
    }

}