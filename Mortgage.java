/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mortgage;

/**
 *
 * @author Esha
 */
public class Mortgage {
double cost = 10000;
double years = 25;
double rate = 1;
double total;


public double total(){
total =  (cost*(1+(rate/100)));
return total;
}

public double amountPerYear(){
double amountPerYear = (total()/years);
return amountPerYear;
}

public double numberOfYears(){
double numberOfYears = ((total-cost)/years);
return numberOfYears;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Mortgage mortgageYear1 = new Mortgage();

mortgageYear1.total();
mortgageYear1.amountPerYear();
mortgageYear1.numberOfYears();

System.out.println("The total to be paid after one year is: " +mortgageYear1.total() );
System.out.println("The amount per year is: " + mortgageYear1.amountPerYear());
System.out.println("The number of years is: " + mortgageYear1.numberOfYears());

    // TODO code application logic here
    }
    
}
