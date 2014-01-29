public class Supermarket{
    
   
    PersonStack newPerson = new PersonStack();
    
    public void addPerson(PersonStack a){
        this.newPerson.insert(a);
        System.out.println(newPerson);
    
    }
    
    public String servePerson(){
        this.newPerson.retrieve();
        return (newPerson+ " is served");
    }
    
    public static void main(String[] args){
        Supermarket ASDA = new Supermarket();
        ASDA.launch();
    }
    
    public void launch(){
        PersonStack newPerson;
     
        PersonStack TescoCustomer = new PersonStack();
        newPerson = TescoCustomer;
        
        PersonStack newPerson2 = new PersonStack();
        newPerson.insert(newPerson2);
        
        
        PersonStack newPerson3 = new PersonStack();
        newPerson.insert(newPerson3);
    
        PersonStack newPerson4 = new PersonStack();
        newPerson.insert(newPerson4);
        
        System.out.println(servePerson());
        System.out.println(servePerson());
    }
        
}