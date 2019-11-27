package myproject;
import java.text.SimpleDateFormat;
import java.util.*;
//import java.io.*;
class Function implements lib
{
	Date date = new Date();
	
	int maxcount = 20,mincount = 0;
	
	String[] bookNames = new String[maxcount];
	
	public void drawbook(String name)
	{
		try {
			
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date = simpleDateFormat.format(new Date());
			
			bookNames[mincount++] = name;
			System.out.println("Your book was registered! \n\nYour Registration Details : \n-------------------------------\nDate and Time\t:\t" + (date.toString()) + "\nBook Name\t:\t" + name +"\nDue Date\t:\t1 month\n-------------------------------");
		}
	
		catch(Exception e) {
			System.out.println("The Books are not available in this time !");
		}
		
	}
	public void returnbook(String name)
	{
		if(!fine())
		{
			
		}
	}
	public void reservedbook() 
	{
		
	}
	
	public boolean fine()
	{
		
		return true;
	}
}


public class Library 
{

	public static void main(String[] args) 
	{
	
	Function get = new Function();
	
	get.drawbook("jack");

	}

}
