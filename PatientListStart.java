public class PatientListStart{

        private Patient patientListStart = null;

        public void launch(){
            
        
            Patient firstPatient = new Patient("John", 33, "Tuberculosis"); 
            patientListStart =firstPatient;
            
            
            Patient newPatient1 = new Patient("Mary", 29, "Autism");
            patientListStart.addPatient(newPatient1);
            
            
            Patient newPatient2 = new Patient("Fred", 20, "Down syndrome");
            patientListStart.addPatient(newPatient2);
            
            
            Patient newPatient3 = new Patient("Robby", 19, "ADHD");
            patientListStart.addPatient(newPatient3);
            
            
            Patient newPatient4 = new Patient("Jesse", 75, "Eating Disorder");
            patientListStart.addPatient(newPatient4);
            
            
            Patient newPatient5 = new Patient("Lila", 56, "Bipolar");
            patientListStart.addPatient(newPatient5);
            
            
            Patient newPatient6 = new Patient("Aaron", 89, "Depression");
            patientListStart.addPatient(newPatient6);
            
            
            Patient newPatient7 = new Patient("Liliya", 56, "Hernia");
            patientListStart.addPatient(newPatient7);
            
            
            Patient newPatient8 = new Patient("Amy", 43, "Arthritis");
            patientListStart.addPatient(newPatient8);
            
            
            Patient newPatient9 = new Patient("Micheal", 21, "Cancer");
            patientListStart.addPatient(newPatient9);
            
            System.out.println("The original list is : ");
            firstPatient.printPatient();
            /*newPatient1.printPatient();
            newPatient2.printPatient();
            newPatient3.printPatient();
            newPatient4.printPatient();
            newPatient5.printPatient();
            newPatient6.printPatient();
            newPatient7.printPatient();
            newPatient8.printPatient();
            newPatient9.printPatient();*/
             System.out.println(patientListStart.getPatient());
            
           
            patientListStart.deletePatient(newPatient5);
            System.out.println("\n\n");
             System.out.println("\n\n"
            + "The shorter list is: ");
             
             
            firstPatient.printPatient();
            /*newPatient1.printPatient();
            newPatient2.printPatient();
            newPatient3.printPatient();
            newPatient4.printPatient();
            newPatient5.printPatient();
            newPatient6.printPatient();
            newPatient7.printPatient();
            newPatient8.printPatient();
            newPatient9.printPatient();*/
            
            
            //System.out.println(patientListStart.countPatient(patientListStart));
            
           // Patient getCount = new Patient();
           System.out.println(patientListStart.getPatient());
        }        
}
