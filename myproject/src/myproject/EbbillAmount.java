package myproject;
import java.util.*;
class Ebamount
{
	double bill;
	String name;
	int pmr,cmr,sum,cno;
	double domestic(int data)
	{
		if(data<=100)
		{
			bill=data*1;
			return bill;
		}
		if(data<=200)
		{
			bill=data*2.5;
			return bill;
		}
		if(data<=500)
		{
			bill=data*4;
			return bill;
		}
		else
		{
			bill=data*6;
			return bill;
		}	
	}
	double commercial(int data)
	{
		if(data<=100)
		{
			bill=data*2;
			return bill;
		}
		if(data<=200)
		{
			bill=data*4.75;
			return bill;
		}
		if(data<=500)
		{
			bill=data*6;
			return bill;
		}
		else
		{
			bill=data*7;
			return bill;
		}
	}
	void getdata()
	{
		System.out.println("enter following details....");
		Scanner s=new Scanner(System.in);
		System.out.println("enter name  : ");
		name=s.nextLine();
		System.out.println("enter no  : ");
		cno=s.nextInt();
		System.out.println("enter pmr  : ");
		pmr=s.nextInt();
		System.out.println("enter cmr  : ");
		cmr=s.nextInt();
	}
	
	int unit()
	{
		return cmr - pmr;
	}
}
public class EbbillAmount 
{

	public static void main(String[] args) 
	{
		double sum;
		int choice,unit;
		Scanner s=new Scanner(System.in);
		System.out.println("1.domestic\n2.commercial");
		System.out.println("enter your choice  : ");
		choice=s.nextInt();
		Ebamount s1=new Ebamount();
		switch(choice)
		{
		case 1:
			s1.getdata();
			unit=s1.unit();
			sum=s1.domestic(unit);
			System.out.println("your EBbill is rs "+sum+"/-");
			break;
		case 2:
			s1.getdata();
			unit=s1.unit();
			sum=s1.commercial(unit);
			System.out.println("your EBbill is rs "+sum+"/-");
			break;
		}

	}

}
