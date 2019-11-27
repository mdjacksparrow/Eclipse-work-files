
import java.util.Scanner;

public class PrimeNum 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter range : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
		for(int i = 1; i <= num ; i++)
		{
			if(isPrime(i) == 0)
				continue;
			else
				System.out.println(isPrime(i));
		}
		scanner.close();
				
	}
	
	public static int isPrime(int val)
	{
		int remainder;
		boolean flag = true;
		
		for (int i = 2; i <= val/2; i++)
		{
			remainder = val % i;
			//System.out.println(val + "Divided by " + i + "is " + remainder);
			

			if(remainder == 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			return val;
		return 0;
	}

}
