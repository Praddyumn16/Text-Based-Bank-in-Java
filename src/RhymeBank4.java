import java.util.Scanner;
public class RhymeBank4 {
	public static void main(String[] args)
{
	System.out.println("Bank Admin Menu:");
	System.out.println("Please enter a menu option");
	System.out.println("(1): Add customer to bank");
	System.out.println("(2): Change Customer Name");
	System.out.println("(3): Check Account Balance");
	System.out.println("(4): Modify Account Balance");
	System.out.println("(5): Summary of All Accounts");
	System.out.println("(-1): Quit");
	
	Scanner input = new Scanner(System.in);
	int userInput=input.nextInt();
	int size = 0;
	double[] accountBalances = new double[250];
	String[] accountNames = new String[250];
	if(userInput == 1)
	{System.out.println("Adding a Customer Menu:");
	System.out.println("Please enter an Account Balance");
	double balance = input.nextDouble();
	accountBalances[size] = balance;
	System.out.println("Please enter the Account Name");
	input.hasNextLine();
	String name= input.next();
	accountNames[size] = name;
	System.out.println("Customer Id is: " + size);
	size = size + 1;
	
		
	}
	else if(userInput == 2)
	{
		
	}
	else if(userInput == 3)
	{
		
	}
	else if(userInput == 4)
	{
		
	}
	else if(userInput == 5)
	{
		
	}
	else{
		
	}
}
}
