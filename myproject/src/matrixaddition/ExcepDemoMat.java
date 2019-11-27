package matrixaddition;

import java.util.Scanner;

public class ExcepDemoMat 
{

	public static void main(String[] args)
	{
		try {
			
			Integer[][] mat1 = new Integer[2][2];
			Integer[][] mat2 = new Integer[2][2];
			Integer[][] res = new Integer[2][2];
			
			for(int i = 0; i <= 1; i++)
			{
				for(int j = 0; j <= 1; j++)
				{
					System.out.println("Enter Mat1[" + i + "] [" + j + "]  :");
					mat1[i][j] = new Scanner(System.in).nextInt();
				}
			}
			
			for(int i = 0; i <= 1; i++)
			{
				for(int j = 0; j <= 1; j++)
				{
					System.out.println("Enter Mat2[" + i + "] [" + j + "]  :");
					mat2[i][j] = new Scanner(System.in).nextInt();
				}
			}
			

			for(int i = 0; i <= 1; i++)
			{
				for(int j = 0; j <= 1; j++)
				{
					res[i][j] =mat1[i][j] + mat2[i][j];
				}
			}
			

			for(int i = 0; i <= 1; i++)
			{
				for(int j = 0; j <= 1; j++)
				{
					System.out.println(res[i][j]);
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Give proper input!");
		}
	}

}
