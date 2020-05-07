import java.util.Scanner;
public class RhymeBank5{
	public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		int userInput;
		int size = 0;
		double[] accountBalances = new double[250];
		String[] accountNames = new String[250];
	for(;true;)
		{
		System.out.println("Bank Admin Menu:");
	System.out.println("Please enter a menu option");
	System.out.println("(1): Add customer to bank");
	System.out.println("(2): Change Customer Name");
	System.out.println("(3): Check Account Balance");
	System.out.println("(4): Modify Account Balance");
	System.out.println("(5): Summary of All Accounts");
	System.out.println("(-1): Quit");
	
	userInput=input.nextInt();
	if(userInput == 1)
	{
	System.out.println("Adding a Customer Menu:");
	System.out.println("Please enter an Account Balance");
	double balance = input.nextDouble();
	accountBalances[size] = balance;
	System.out.println("Please enter the Account Name");
	input.nextLine();
	String name= input.next();
	accountNames[size] = name;
	System.out.println("Customer Id is: " + size);
	size = size + 1;
    }
	else if(userInput == 2)
	{
		System.out.println("Changing the Name Menu:");
		System.out.println("Please enter the customer Id");
		int index = input.nextInt();
		System.out.println("Please enter the updated name");
		input.nextLine();
		accountNames[index] = input.nextLine();
		
	}
	else if(userInput == 3)
	{
		System.out.println("Checking the Account Balance Menu:");
		System.out.println("Please enter the customer Id");
		int index = input.nextInt();
		double balance = accountBalances[index];
		System.out.println("This customer has $" + balance + " in their account");
		
		
	}
	else if(userInput == 4)
	{
		System.out.println("Modifying the Account Balance Menu:");
		System.out.println("Please enter the customer Id");
		int index = input.nextInt();
		System.out.println("Please enter the updated balance");
		double balance = input.nextDouble();
		accountBalances[index] = balance;
		System.out.println("Updated Balance is $" + balance);
		
	}
	else if(userInput == 5)
	{
		System.out.println("Bank's all Account's Summary Menu");
		double total = 0.0;
		for(int i=0;i<size;i++)
		{total = total + accountBalances[i];
		System.out.println(accountNames[i] +  "has $" + accountBalances[i] +" in their account");
		}
		System.out.println("In total, the bank has $" + total + " in the bank");
		
	}
	else if(userInput == -1)
	{
		System.exit(-1);
	}
	else{
		System.out.println("Error: Please enter a valid input");
	}
}
}
}
