package test;
import java.util.Scanner;

public class EmailGeneration 
{

	public static void main(String[] args) 
	{
		String first , last , email = "";
		Scanner get = new Scanner(System.in);
		
		System.out.print("Enter first name : ");
		first = get.nextLine();
		
		System.out.print("Enter last name : ");
		last = get.nextLine();
		
		char[] c1 = first.toCharArray();
		for(int i = 0 ; i < 3; i++)
			email += c1[i];
		
		email += '.';
		
		char[] c2 = last.toCharArray();
		for(int i = 0 ; i < 4; i++)
			email += c2[i];
		
		email += "@gmail.com";
		
		System.out.println("Generated EMAIL is : " + email);
		get.close();
	}

}
