package MyListPackage;

public class MyNode
{
    private int n;
    private MyNode nextNode;
    
    MyNode()
    {
        n=0;
        nextNode = null;
    }
    
    MyNode(int x, MyNode next)
    {
        n=x;
        nextNode = next;
    }
    
    public int getN()
    {
        return this.n;
    }
    
    public MyNode getNext()
    {
        return this.nextNode;
    }
    
    public void add(MyNode node)
    {
        if(this.getNext() == null){
            
            this.nextNode = node;}
        else      
            this.getNext().add(node);       
    }

        public void printNode(){
        System.out.println(n);
        }

}