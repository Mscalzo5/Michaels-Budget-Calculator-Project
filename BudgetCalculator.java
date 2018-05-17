import java.util.Scanner;
import java.io.IOException;
import java.util.*; 
/**
 *
 * @author Michael Scalzo
 */
public class BudgetCalculator extends TotalBudget {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Michael's budget planning program."
        		+ "\nThis program uses an 50/20/30 formula to calculate a bud"
        		+ "get based on your income.");
    	//create instance of scanner to retrieve user input
    	Scanner in = new Scanner(System.in);
    	System.out.println("(Press the \"enter\" key to continue)");
    	
    	try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	String answer; //declare variable for the user's answer about using a recommended budget
     	TotalBudget one = new TotalBudget();   	  	
    	//create new instance of the TotalBudget class	
        System.out.println("Would you like to use our recommended budget "
        		+ "? \nPlease type \"y\", or if you would like to use your own budget, "
        		+ "type \"n\"");
    	answer = in.next();	//scan user input for their answer
    	  	
    	if (!(answer.equals("y") || answer.equals("n"))){
    		do {  	//repeat this block of code until user enters y or n   	    		
    		System.out.println("Please Enter either \"y\" or \"n\"" );
    		answer = in.next();
    		} while (!(answer.equals("y") || answer.equals("n")));	}
    		
    	if(answer.equals("y")) { //user answers "yes" to using the recommended budget
    	    	one.get_recommended_budget(); //import method from "totalbudget" class
    	    }
    	    else if (answer.equals("n")){ //user answers no and wants to use their own budget
    	    	 System.out.println("Enter your monthly budget.");
    	    	 one.budget= in.nextDouble();
    	    }
    	   
    	//begin retrieving users expenses    
        System.out.println("Enter your monthly food expenses.");
        one.foodExpenses = in.nextDouble();
        System.out.println("Enter your monthly gas expenses.");
        one.gasExpenses = in.nextDouble();
        System.out.println("Enter your total recreational expenses.");
        one.recreationalExpenses = in.nextDouble();
        System.out.println("Enter your monthly phone bill.");
        one.phonebill = in.nextDouble();
        one.totalExpenses = 0.0;
        one.getTotalExpenses();
        if(one.totalExpenses > one.budget) { //notify user if they exceeded the budget
        	System.out.println("Your expenses exceed your monthly budget!");
        	one.difference=0.0;
        	one.getDifference(); //calculate difference between user expenses and budget
        	}
    
}


}

