package test;

class Gen<T extends Comparable<T>>
{
	T[] a;
	public Gen(T[] o)
	{
		this.a = o;
	}
	
	public T max()
	{
		T max = a[0] ; 

		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i].compareTo(max) > 0)
			{
				max = a[i];
			}
		}
		
		return max;
	}
}

public class Generic_max 
{

	public static void main(String[] args) 
	{
		Integer num[] = {6,2,4,7,4,8};
		Double d[] = { 3.6,7.8,42.5};
		
		Gen<Integer> o = new Gen<Integer>(num);
		Gen<Double> o1 = new Gen<Double>(d);
		
		System.out.println("max integer is: " + o.max());
		System.out.println("Max double is: " + o1.max());
	}

}
