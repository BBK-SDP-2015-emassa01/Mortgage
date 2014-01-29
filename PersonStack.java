
public class PersonStack implements PersonQueue{
    PersonStack lastElement = null;
    /*
     * Pushes a new string onto the stack in an array
     */
     
    private String[] PersonArray;
    private static int INITIAL_ARRAY_SIZE = 5;
    /**
     * The number of strings in this stack
     */
    private int size;
    
    public PersonStack() {  
            PersonArray = new String[INITIAL_ARRAY_SIZE];
            size = 0;
    }
    
    public PersonStack retrieve(){
        this.lastElement = null;
    return this.lastElement;
    }
    
    public void insert(PersonStack person){
    if (this.lastElement == null) {
        this.lastElement = person;
     }
    }

    
    
    public void push(String newPerson){
    if (isAlmostFull()){
    reserveMoreMemory();
    }
    PersonArray[size] = newPerson;
    size++;
    }

    /*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
    public String pop(){
    	  if (isEmpty()) {
		return null;
	  }
	  size--;
	  String result = PersonArray[size];
	  PersonArray[size] = null;
	  return result;
    }

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    public String peek(){
    if (isEmpty()) {
		return null;
	  } else {
		return PersonArray[size - 1];
	  }
}

    /* 
     * Returns true if the stack contains no elements, 
     * false otherwise. 
     */
    public boolean isEmpty(){
     if (size == 0) {
		return true;
	  } else {
		return false;
	  }
}
    
        private boolean isAlmostFull() {
	  if (PersonArray.length - size < 1) {
		return true;
	  } else {
		return false;
	  }
    }
        
            private void reserveMoreMemory() {
	  String[] biggerArray = new String[size*2];
	  for (int i = 0; i < size; i++) {
		biggerArray[i] = this.PersonArray[i];
	  }
	  this.PersonArray = biggerArray;
    }
}