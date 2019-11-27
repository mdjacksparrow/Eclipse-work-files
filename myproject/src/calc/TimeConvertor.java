package calc;

import java.text.DecimalFormat;

/*
 * 	Hour(60)	->	min
 * 	Hour(3600)	->	sec
 * (and vice versa)
 */
public class TimeConvertor
{
	public void hourToMin(double data)		//2.0	->	120
	{
		double result =data * 60;
		System.out.println("The " + data + " hour is " + (int)result + " minutes");
	}
	
	public void hourToSec(double data)		
	{
		double result =data * 3600;
		System.out.println("The " + data + " hour is " + (int)result + " sec");
	}	
	
	public void minToHour(double data)		
	{
		double result =data / 60;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + (int)data + " min is " + result + " hour");
	}
	
	public void secToHour(double data)		
	{
		double result = data / 3600;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data + " sec is " + result + " hour");
	}
}

