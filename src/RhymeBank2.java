import java.util.Scanner;
public class RhymeBank2 {
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
	System.out.println(userInput);
	}
}
