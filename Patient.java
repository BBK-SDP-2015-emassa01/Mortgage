public class Patient {
    
    private int patientCount = 1;
    final private String name;
    final private int age;
    final private String illness;
    private Patient nextPatient;
    private Patient previousPatient;
    private Patient head;
// methods like constructors, getters // and setters come here...

public Patient(String name, int age, String illness) { 
    
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null;
    this.head = null;
   //% this symbol means you do this for a doubly-linked list
    //% this.previousPatient = null;
}

public void addPatient(Patient newPatient) {
    patientCount++;
    if (this.nextPatient == null) {
    // this means this is the last patient in the list 
        this.nextPatient = newPatient;
       //%  newPatient.previousPatient = this;
   
    } else { 
        this.nextPatient.addPatient(newPatient);
    } }

public boolean deletePatient(Patient patient) { 
    patientCount--;
    if (this.nextPatient == null) {
// patient to remove was not found
return false;
} else if (this.nextPatient.name.equals(patient.name)) {
// We found it! It is the next one!
// Now link this patient to the one after the next 
    patient.printPatient();
    this.nextPatient = nextPatient.nextPatient; 
    //% previousPatient.previousPatient = this.previousPatient;
  
    return true;
} else {
return this.nextPatient.deletePatient(patient);
} 
}

public void printPatient(){
    
       if (this.previousPatient != null) { //its the end of the list
           System.out.println(" Name: "+ name+ "\tAge: "+ age + "\tIllness: "+ illness + "  \nNext Patient Number: " + nextPatient + 
        "\n Previous Patient: "+ previousPatient); 
           this.previousPatient.printPatient();
       } else{
System.out.println(" Name: "+ name+ "\tAge: "+ age + "\tIllness: "+ illness + "  \nNext Patient Number: " + nextPatient + 
        "\n Previous Patient: "+ previousPatient);

}
}

public int getPatient(){
return patientCount;
}

public int countPatient(Patient patient) {
    int counter = 0;
    if (this.nextPatient == null) {
        counter++;
        return counter;
    // this means this is the last patient in the list 
        
    } else {
        counter++;
        return  
        this.nextPatient.countPatient(patient);
    }
   
    
}




}


    