
import java.util.Scanner;

interface card
{
	public void viewCreditAmount(int x);
	public void viewPin();
	public void changePin();
	public void payBalance();
}

class Customer implements card
{
	Scanner get = new Scanner(System.in);
	String name, ac;
	char ch;
	int pin = 1234, amount = 0;
	
//	To initialize the class
	Customer(String acname, String acno)
	{
		this.name = acname;
		this.ac = acno;
	}

	@Override
	public void viewCreditAmount(int amount) 
	{
		System.out.println("Credited amount is : " + amount);
	}

	@Override
	public void viewPin() 
	{
		System.out.println("Current pin is : " + pin);
		System.out.println("Do u want to change it ?(y/n) ");
		ch = get.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y')
		{
			this.changePin();
		}
		else
		{
			System.out.println("Go back...");
		}
		
	}

	@Override
	public void changePin()
	{
		int temp , c1,c2; 
		
		System.out.print("Enter current Pin : ");
		temp = get.nextInt();
		
		if(temp == pin)
		{
			System.out.print("Enter New PIN: ");
			c1 = new Scanner(System.in).nextInt();
			
			System.out.print("Re-Enter Confirm PIN: ");
			c2 = new Scanner(System.in).nextInt();
			
			if(c1 == c2)
			{
				pin = c1;
				System.out.println("Successfully changed!");
			}
		}
		else
		{
			System.out.println("Wrong pin! Try again!!");
		}
	}

	@Override
	public void payBalance()
	{
		this.viewCreditAmount(amount);
	}
}

public class CreditCardInterface 
{
	public static void main(String[] args)
	{
		Customer o = new Customer("jack","10000232534");
		o.viewCreditAmount(1000);
		o.viewPin();
	}
}
