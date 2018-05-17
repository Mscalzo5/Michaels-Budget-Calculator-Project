import java.util.Scanner;
/**
 *
 * @author Michael Scalzo
 */
public class TotalBudget {
   
    Scanner in = new Scanner(System.in);
	double totalExpenses;
    double foodExpenses;
    double gasExpenses;
    double phonebill;
    double recreationalExpenses; 
    double difference;
    double budget;
    double foodBudget;
    double gasBudget;
    double recreationalBudget;
    double rAmount_for_essentials;
    double rAmount_for_savings;
    double rAmount_for_personal;
    double user_income;
      
    
    public void getTotalExpenses() { //method for calculating the users total expenses for the month
    
        totalExpenses = (foodExpenses + gasExpenses + phonebill + recreationalExpenses);
        System.out.println("Your total monthly expenses are $" + totalExpenses);
    } //method for calculating the users total expenses
    
    public void getDifference() { //method for calculating the difference between expenses and budget
    	
    	difference = (totalExpenses - budget);
    	System.out.println("You are over your budget by $"+ difference);
    } //method for calculating how much the user went over or under
    
    publi-c void get_recommended_budget() { //method for giving the user a recommended budget
    	System.out.println("Please enter your monthly income");
    	user_income = in.nextDouble(); 
    	rAmount_for_essentials = (user_income * .50);
    	rAmount_for_savings = (user_income * .20);
    	rAmount_for_personal = (user_income * .30);
    	budget = (rAmount_for_essentials + rAmount_for_personal);
    	System.out.println("You should save $" + rAmount_for_savings + " monthly");
    	System.out.println("You can spend $" + rAmount_for_essentials + " on essentials");
    	System.out.println("You can spend $" + rAmount_for_personal + " on personals");
    	System.out.println("Your total recommended monthly budget is $" + budget);
    }
}