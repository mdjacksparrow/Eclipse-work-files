package test;
import java.util.Calendar;
import java.util.Scanner;

public class CountDate 
{
	public static void main(String[] args)
	{
		Scanner get = new Scanner(System.in);
		Calendar o = Calendar.getInstance();
		
		int no_date,year,month;
		
		System.out.println("Enter year : ");
		year = get.nextInt();
		
		System.out.println("Enter month : ");
		month = get.nextInt();
		
		o.set(Calendar.YEAR, year);
		o.set(Calendar.MONTH, month-1);
		
		no_date = o.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("Days are : " + no_date);
		get.close();
	}
}
