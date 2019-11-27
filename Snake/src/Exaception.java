
import java.util.Scanner;

class MyExp extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("Fuck U!");
	}
}

public class Exaception 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner get = new Scanner(System.in);
		try
		{
			String name = "";
			
			System.out.println("Enter name : (Don't type hello after u felt it!) : ");
			name = get.nextLine();
			
			if(name.toLowerCase().equals("hello"))
			{
				throw new MyExp();
			}
			else
			{
				get.close();
				System.out.println("Proceed again!");
			}
			
		}
		catch(MyExp o)
		{
			//System.out.println("Catch block");
			System.out.println(o);
			get.close();
			
		}
	}

}
