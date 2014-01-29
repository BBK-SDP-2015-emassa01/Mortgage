import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class HashUtilities implements HashFunction{
  
    private static int shortHashNum;
            
    public  int shortHash(int i){  
        int a = i%1000;
        return a;
    }
         
   //     shortHashNum = a;
     //   return shortHashNum;
      
    //}
    
    
    public static void main(String[] args){
        HashFunction A = new HashUtilities();
        System.out.println ("Give me a string and I will calculate its hash code");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int hash = str.hashCode();
        int smallHash = A.shortHash(hash);
         smallHash = Math.abs(smallHash);
        System.out.println("0 < " + smallHash + " < 1000");
    
    }
}
