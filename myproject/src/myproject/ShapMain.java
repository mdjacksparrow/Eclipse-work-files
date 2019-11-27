package myproject;
class Shape{
	
	double value;
	
	Shape(double dimention)
	{
		this.value = dimention;
	}
	
	void circle()
	{
		double result;
		result = 2 * 3.14 * value;
		
		System.out.println("Area   :   " + result);
		result = 3.14 * value * value;
		System.out.println("Circumference  :  " + result);
	}
	
	void square() 
	{
		double result;
		result = value * value;
		
		System.out.println("Area   :   " + result);
		result = 1.414 * value * value;
		System.out.println("Length of the diagonal  :  " + result);
	}
	
	void sphere() 
	{
		double result;
		result = 4/3 * (3.14 * value * value * value);
		
		System.out.println("Area   :   " + result);
		result = 4 * 3.14 * value * value;
		System.out.println("Surface of the Sphere  :  " + result);
	}
}



public class ShapMain 
{

	public static void main(String[] args)
	{
		Shape obj = new Shape(44);
		obj.circle();
		
		Shape obj1 = new Shape(20);
		obj1.square();
		
		Shape obj2 = new Shape(20);
		obj2.sphere();
	}

}
