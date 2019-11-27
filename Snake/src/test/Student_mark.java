package test;
import java.util.Scanner;

class Student
{
	int total = 0;
	char grade = ' ';
	double avg = 0;

	Integer mark[] = new Integer[5];
	Scanner get = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("-----Mark System-----");
		System.out.println("Enter 5 Subject marks : ");
		
		for(int i = 0; i < mark.length; i++)
		{
			System.out.print("Enter " + (i+1) + "Mark :");
			mark[i] = get.nextInt();
			total += mark[i];
		}
		avg = total/5;
	}
	
	void grade()
	{
		if((91 <= avg) && (avg <= 100))
		{
			System.out.println("Grade :   O");
			System.out.println("Total : " + total);
			System.out.println("Average: " + avg);
		}
		if((81 <= avg) && (avg <= 90))
		{
			System.out.println("Grade :   A+");
			System.out.println("Total : " + total);
			System.out.println("Average: " + avg);
		}
		if((71 <= avg) && (avg <= 80))
		{
			System.out.println("Grade :   A");
			System.out.println("Total : " + total);
			System.out.println("Average: " + avg);
		}
		if((61 <= avg) && (avg <= 70))
		{
			System.out.println("Grade :   B+");
			System.out.println("Total : " + total);
			System.out.println("Average: " + avg);
		}
		if((51 <= avg) && (avg <= 60))
		{
			System.out.println("Grade :   B");
			System.out.println("Total : " + total);
			System.out.println("Average: " + avg);
		}
		if(50 >= avg)
		{
			System.out.println("Grade :   RA");
			System.out.println("Total : " + total);
			System.out.println("Average: " + avg);
		}
	}
}

public class Student_mark 
{

	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.getData();
		obj.grade();
	}

}
