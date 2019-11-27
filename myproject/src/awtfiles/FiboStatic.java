package awtfiles;

import java.util.Scanner;

public class FiboStatic 
{
	
	
		public static void main(String[] args)
		{
			System.out.println("in main");
			fibo();
		}
		
		public static void fibo()
		{
			int n, b1 = 0, b2 = 1, b3;
			n = new Scanner(System.in).nextInt();
			
			System.out.println(b1 + " " + b2);
			
			for(int i = 0; i <= n;i++)
				{
				
					b3 = b1 + b2;
					b1 = b2;
					b2 = b3;
					System.out.println(b3);
					
				}
		}
}
