package matrixaddition;

abstract class Abs
{
	abstract void matAdd();
}

class A extends Abs
{

	@Override
	void matAdd()
	{
		Integer[][] mat1 = new Integer[2][2];
		Integer[][] mat2 = new Integer[2][2];
		Integer[][] res = new Integer[2][2];
		
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				mat1[i][j] = 1;
			}
		}
		
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				mat2[i][j] = 1;
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
	
}
public class AbstractClass 
{
	
	public static void main(String[] args)
	{
		A o = new A();
		o.matAdd();
	}
}
