package MyListPackage;

public class testerClass{

    public static void main(String[] args){
    
        MyList tester = new MyList();
        
        MyNode testerNode = new MyNode(3, null);
                tester.add(testerNode);
                
        testerNode = new MyNode(6, null);
                tester.add(testerNode);
                
        testerNode = new MyNode(12, null);
                tester.add(testerNode);
                
        testerNode = new MyNode(5, null);
                tester.add(testerNode);
                
                tester.print();
    }

}