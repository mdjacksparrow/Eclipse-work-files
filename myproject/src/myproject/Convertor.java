package myproject;

import java.text.DecimalFormat;

/*	
 * Doller(68.85)	->	INR			
 * EURO(77.26)		->	INR			
 * Yen(0.64)		->	INR			
 * (and vice versa)	
*/


class CurrencyConvertor
{
	void dollerToINR(double data)
	{
		double result = data * 68.85;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The INR is Rs." + result + "/-");
	}
	
	void euroToINR(double data)
	{
		double result = data * 77.26;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The INR is Rs." + result + "/-");
	}

	void yenToINR(double data)
	{
		double result = data * 0.64;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The INR is Rs." + result + "/-");
	}
	
	void inrToDoller(double data)
	{
		double result = data / 68.85;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The Doller is $" + result);
	}
	
	void inrToEuro(double data)
	{
		double result = data / 77.26;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The Euro is 円 " + result +"ē");
	}
	
	void inrToYen(double data)
	{
		double result = data / 0.64;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The Yen is - " + result);
	}
}

/*
 * 	Meter(1000)		->	KM
 *  Miles(0.621)	->	KM
 *  (and vice versa)
 */

class DistanceConvertor extends CurrencyConvertor
{
	void meterToKM(double data)
	{
		double result = data / 1000;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The "+ data +" meter is " + result + "Km");
	}
	
	void milesToKM(double data)
	{
		double result = data / 0.621;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data +" meter is " + result + "Km");
	}
	
	void KMToMeter(double data)
	{
		double result = data * 1000;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The "+ data +" KM is " + result + "meter");
	}
	
	void KMTomiles(double data)
	{
		double result = data * 0.621;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data +" KM is " + result + "miles");
	}
}


/*
 * 	Hour(60)	->	min
 * 	Hour(3600)	->	sec
 * (and vice versa)
 */
class TimeConvertor
{
	void hourToMin(double data)		//2.0	->	120
	{
		double result =data * 60;
		System.out.println("The " + data + " hour is " + (int)result + " minutes");
	}
	
	void hourToSec(double data)		
	{
		double result =data * 3600;
		System.out.println("The " + data + " hour is " + (int)result + " sec");
	}	
	
	void minToHour(double data)		
	{
		double result =data / 60;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + (int)data + " min is " + result + " hour");
	}
	
	void secToHour(double data)		
	{
		double result = data / 3600;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data + " sec is " + result + " hour");
	}
}

